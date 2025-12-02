package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.AbortError;
import androidx.credentials.exceptions.domerrors.ConstraintError;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.domerrors.DomError;
import androidx.credentials.exceptions.domerrors.EncodingError;
import androidx.credentials.exceptions.domerrors.InvalidStateError;
import androidx.credentials.exceptions.domerrors.NetworkError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import androidx.credentials.exceptions.domerrors.NotReadableError;
import androidx.credentials.exceptions.domerrors.NotSupportedError;
import androidx.credentials.exceptions.domerrors.SecurityError;
import androidx.credentials.exceptions.domerrors.TimeoutError;
import androidx.credentials.exceptions.domerrors.UnknownError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes.dex */
public abstract class PublicKeyCredentialControllerUtility {
    public static final Companion Companion = new Companion(null);
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    private static final String JSON_KEY_SIGNATURE = "signature";
    private static final String JSON_KEY_USER_HANDLE = "userHandle";
    private static final String JSON_KEY_RESPONSE = "response";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_RAW_ID = "rawId";
    private static final String JSON_KEY_TYPE = "type";
    private static final String JSON_KEY_RPID = "rpId";
    private static final String JSON_KEY_CHALLENGE = "challenge";
    private static final String JSON_KEY_APPID = "appid";
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final String JSON_KEY_RES_KEY = "residentKey";
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final String JSON_KEY_TIMEOUT = "timeout";
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final String JSON_KEY_TRANSPORTS = "transports";
    private static final String JSON_KEY_RP = "rp";
    private static final String JSON_KEY_NAME = "name";
    private static final String JSON_KEY_ICON = "icon";
    private static final String JSON_KEY_ALG = "alg";
    private static final String JSON_KEY_USER = "user";
    private static final String JSON_KEY_DISPLAY_NAME = "displayName";
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final String JSON_KEY_EXTENSTIONS = "extensions";
    private static final String JSON_KEY_ATTESTATION = "attestation";
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final String JSON_KEY_RK = "rk";
    private static final String JSON_KEY_CRED_PROPS = "credProps";
    private static final LinkedHashMap orderedErrorCodeToExceptions = MapsKt.linkedMapOf(TuplesKt.to(ErrorCode.UNKNOWN_ERR, new UnknownError()), TuplesKt.to(ErrorCode.ABORT_ERR, new AbortError()), TuplesKt.to(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new NotReadableError()), TuplesKt.to(ErrorCode.CONSTRAINT_ERR, new ConstraintError()), TuplesKt.to(ErrorCode.DATA_ERR, new DataError()), TuplesKt.to(ErrorCode.INVALID_STATE_ERR, new InvalidStateError()), TuplesKt.to(ErrorCode.ENCODING_ERR, new EncodingError()), TuplesKt.to(ErrorCode.NETWORK_ERR, new NetworkError()), TuplesKt.to(ErrorCode.NOT_ALLOWED_ERR, new NotAllowedError()), TuplesKt.to(ErrorCode.NOT_SUPPORTED_ERR, new NotSupportedError()), TuplesKt.to(ErrorCode.SECURITY_ERR, new SecurityError()), TuplesKt.to(ErrorCode.TIMEOUT_ERR, new TimeoutError()));

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final PublicKeyCredentialCreationOptions convert(CreatePublicKeyCredentialRequest request, Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            if (isDeviceGMSVersionOlderThan(context, 241217000L)) {
                return new PublicKeyCredentialCreationOptions(request.getRequestJson());
            }
            return convertJSON$credentials_play_services_auth_release(new JSONObject(request.getRequestJson()));
        }

        private final boolean isDeviceGMSVersionOlderThan(Context context, long j) {
            long j2;
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
                j2 = GetGMSVersion.getVersionLong(packageInfo);
            } else {
                j2 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            return j2 > j;
        }

        public final PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth_release(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            PublicKeyCredentialCreationOptions.Builder builder = new PublicKeyCredentialCreationOptions.Builder();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(json, builder);
            parseRequiredRpAndParams$credentials_play_services_auth_release(json, builder);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(json, builder);
            parseOptionalTimeout$credentials_play_services_auth_release(json, builder);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(json, builder);
            parseOptionalExtensions$credentials_play_services_auth_release(json, builder);
            PublicKeyCredentialCreationOptions build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final String toAssertPasskeyResponse(SignInCredential cred) {
            Intrinsics.checkNotNullParameter(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential publicKeyCredential = cred.getPublicKeyCredential();
            AuthenticatorResponse response = publicKeyCredential != null ? publicKeyCredential.getResponse() : null;
            Intrinsics.checkNotNull(response);
            if (response instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
                ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
                Intrinsics.checkNotNullExpressionValue(errorCode, "getErrorCode(...)");
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(errorCode, authenticatorErrorResponse.getErrorMessage());
            }
            if (response instanceof AuthenticatorAssertionResponse) {
                try {
                    String json = publicKeyCredential.toJson();
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    return json;
                } catch (Throwable th) {
                    throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
                }
            }
            Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: " + response.getClass().getName());
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(GetPublicKeyCredentialOption option) {
            Intrinsics.checkNotNullParameter(option, "option");
            BeginSignInRequest.PasskeyJsonRequestOptions build = new BeginSignInRequest.PasskeyJsonRequestOptions.Builder().setSupported(true).setRequestJson(option.getRequestJson()).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(GetPublicKeyCredentialOption option) {
            Intrinsics.checkNotNullParameter(option, "option");
            JSONObject jSONObject = new JSONObject(option.getRequestJson());
            String optString = jSONObject.optString(getJSON_KEY_RPID$credentials_play_services_auth_release(), "");
            Intrinsics.checkNotNull(optString);
            if (optString.length() == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            BeginSignInRequest.PasskeysRequestOptions build = new BeginSignInRequest.PasskeysRequestOptions.Builder().setSupported(true).setRpId(optString).setChallenge(getChallenge(jSONObject)).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        private final byte[] getChallenge(JSONObject jSONObject) {
            String optString = jSONObject.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth_release(), "");
            Intrinsics.checkNotNull(optString);
            if (optString.length() == 0) {
                throw new JSONException("Challenge not found in request or is unexpectedly empty");
            }
            return b64Decode(optString);
        }

        public final CreateCredentialException publicKeyCredentialResponseContainsError(PublicKeyCredential cred) {
            Intrinsics.checkNotNullParameter(cred, "cred");
            AuthenticatorResponse response = cred.getResponse();
            Intrinsics.checkNotNullExpressionValue(response, "getResponse(...)");
            if (!(response instanceof AuthenticatorErrorResponse)) {
                return null;
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
            ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
            Intrinsics.checkNotNullExpressionValue(errorCode, "getErrorCode(...)");
            DomError domError = (DomError) getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(errorCode);
            String errorMessage = authenticatorErrorResponse.getErrorMessage();
            if (domError == null) {
                return new CreatePublicKeyCredentialDomException(new UnknownError(), "unknown fido gms exception - " + errorMessage);
            }
            if (errorCode == ErrorCode.NOT_ALLOWED_ERR && errorMessage != null && StringsKt.contains$default(errorMessage, "Unable to get sync account", false, 2, null)) {
                return new CreateCredentialCancellationException("Passkey registration was cancelled by the user.");
            }
            return new CreatePublicKeyCredentialDomException(domError, errorMessage);
        }

        public final GetCredentialException beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(ErrorCode code, String str) {
            Intrinsics.checkNotNullParameter(code, "code");
            DomError domError = (DomError) getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(code);
            if (domError == null) {
                return new GetPublicKeyCredentialDomException(new UnknownError(), "unknown fido gms exception - " + str);
            }
            if (code == ErrorCode.NOT_ALLOWED_ERR && str != null && StringsKt.contains$default(str, "Unable to get sync account", false, 2, null)) {
                return new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.");
            }
            return new GetPublicKeyCredentialDomException(domError, str);
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release());
                AuthenticationExtensions.Builder builder2 = new AuthenticationExtensions.Builder();
                String optString = jSONObject.optString(getJSON_KEY_APPID$credentials_play_services_auth_release(), "");
                Intrinsics.checkNotNull(optString);
                if (optString.length() > 0) {
                    builder2.setFido2Extension(new FidoAppIdExtension(optString));
                }
                if (jSONObject.optBoolean(getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release(), false)) {
                    builder2.setGoogleThirdPartyPaymentExtension(new GoogleThirdPartyPaymentExtension(true));
                }
                if (jSONObject.optBoolean("uvm", false)) {
                    builder2.setUserVerificationMethodExtension(new UserVerificationMethodExtension(true));
                }
                builder.setAuthenticationExtensions(builder2.build());
            }
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release());
                AuthenticatorSelectionCriteria.Builder builder2 = new AuthenticatorSelectionCriteria.Builder();
                boolean optBoolean = jSONObject.optBoolean(getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release(), false);
                String optString = jSONObject.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth_release(), "");
                Intrinsics.checkNotNull(optString);
                builder2.setRequireResidentKey(Boolean.valueOf(optBoolean)).setResidentKeyRequirement(optString.length() > 0 ? ResidentKeyRequirement.fromString(optString) : null);
                String optString2 = jSONObject.optString(getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release(), "");
                Intrinsics.checkNotNull(optString2);
                if (optString2.length() > 0) {
                    builder2.setAttachment(Attachment.fromString(optString2));
                }
                builder.setAuthenticatorSelection(builder2.build());
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release())) {
                builder.setTimeoutSeconds(Double.valueOf(json.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()) / MediaDataController.MAX_STYLE_RUNS_COUNT));
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (json.has(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release())) {
                JSONArray jSONArray = json.getJSONArray(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    byte[] b64Decode = b64Decode(string);
                    String string2 = jSONObject.getString(getJSON_KEY_TYPE$credentials_play_services_auth_release());
                    Intrinsics.checkNotNull(string2);
                    if (string2.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (b64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release());
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            try {
                                arrayList.add(Transport.fromString(jSONArray2.getString(i2)));
                            } catch (Transport.UnsupportedTransportException e) {
                                throw new CreatePublicKeyCredentialDomException(new EncodingError(), e.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new PublicKeyCredentialDescriptor(string2, b64Decode, arrayList));
                }
            }
            builder.setExcludeList(arrayList2);
            String optString = json.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth_release(), "none");
            Intrinsics.checkNotNull(optString);
            builder.setAttestationConveyancePreference(AttestationConveyancePreference.fromString(optString.length() != 0 ? optString : "none"));
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth_release());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            String optString = jSONObject.optString(getJSON_KEY_NAME$credentials_play_services_auth_release(), "");
            String optString2 = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            Intrinsics.checkNotNull(optString2);
            if (optString2.length() == 0) {
                optString2 = null;
            }
            Intrinsics.checkNotNull(optString);
            if (optString.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            Intrinsics.checkNotNull(string);
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.setRp(new PublicKeyCredentialRpEntity(string, optString, optString2));
            JSONArray jSONArray = json.getJSONArray(getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                int i2 = (int) jSONObject2.getLong(getJSON_KEY_ALG$credentials_play_services_auth_release());
                String optString3 = jSONObject2.optString(getJSON_KEY_TYPE$credentials_play_services_auth_release(), "");
                Intrinsics.checkNotNull(optString3);
                if (optString3.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i2)) {
                    arrayList.add(new PublicKeyCredentialParameters(optString3, i2));
                }
            }
            builder.setParameters(arrayList);
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.setChallenge(getChallenge(json));
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth_release());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            byte[] b64Decode = b64Decode(string);
            String string2 = jSONObject.getString(getJSON_KEY_NAME$credentials_play_services_auth_release());
            String string3 = jSONObject.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release());
            String optString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            Intrinsics.checkNotNull(string3);
            if (string3.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (b64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            Intrinsics.checkNotNull(string2);
            if (string2.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.setUser(new PublicKeyCredentialUserEntity(b64Decode, string2, optString, string3));
        }

        public final byte[] b64Decode(String str) {
            Intrinsics.checkNotNullParameter(str, "str");
            byte[] decode = Base64.decode(str, 11);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            return decode;
        }

        public final boolean checkAlgSupported(int i) {
            try {
                COSEAlgorithmIdentifier.fromCoseValue(i);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final LinkedHashMap getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }
    }

    private static final class GetGMSVersion {
        public static final GetGMSVersion INSTANCE = new GetGMSVersion();

        private GetGMSVersion() {
        }

        public static final long getVersionLong(PackageInfo info) {
            long longVersionCode;
            Intrinsics.checkNotNullParameter(info, "info");
            longVersionCode = info.getLongVersionCode();
            return longVersionCode;
        }
    }
}
