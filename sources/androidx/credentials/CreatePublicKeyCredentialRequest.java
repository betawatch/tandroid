package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.internal.RequestValidationHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public final class CreatePublicKeyCredentialRequest extends CreateCredentialRequest {
    public static final Companion Companion = new Companion(null);
    private final byte[] clientDataHash;
    private final boolean isConditional;
    private final String requestJson;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String requestJson) {
        this(requestJson, null, false, null, false, false, 62, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, boolean z2, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, z, z2, displayInfo, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? Companion.toCredentialDataBundle$credentials_release(str, bArr) : bundle, (i & 128) != 0 ? Companion.toCandidateDataBundle$credentials_release(str, bArr) : bundle2, (i & 256) != 0 ? false : z3);
    }

    public final boolean isConditional() {
        return this.isConditional;
    }

    private CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, boolean z2, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2, boolean z3) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, z, displayInfo, str2, z2);
        this.requestJson = str;
        this.clientDataHash = bArr;
        this.isConditional = z3;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
        if (z3) {
            bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_CONDITIONAL_REQUEST", true);
        }
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String requestJson, byte[] bArr, boolean z, String str, boolean z2, boolean z3) {
        this(requestJson, bArr, z2, z, Companion.getRequestDisplayInfo$credentials_release$default(Companion, requestJson, null, 2, null), str, null, null, z3, NotificationCenter.didUpdatePremiumGiftStickers, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CreateCredentialRequest.DisplayInfo getRequestDisplayInfo$credentials_release$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.getRequestDisplayInfo$credentials_release(str, str2);
        }

        public final CreateCredentialRequest.DisplayInfo getRequestDisplayInfo$credentials_release(String requestJson, String str) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            try {
                JSONObject jSONObject = new JSONObject(requestJson).getJSONObject("user");
                String string = jSONObject.getString("name");
                String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
                Intrinsics.checkNotNull(string);
                return new CreateCredentialRequest.DisplayInfo(string, string2, null, str);
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.name must be defined in requestJson");
            }
        }

        public final Bundle toCredentialDataBundle$credentials_release(String requestJson, byte[] bArr) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }

        public final Bundle toCandidateDataBundle$credentials_release(String requestJson, byte[] bArr) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }
    }
}
