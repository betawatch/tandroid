package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes.dex */
public abstract class CredentialProviderBaseController {
    private final Context context;
    public static final Companion Companion = new Companion(null);
    private static final Set retryables = SetsKt.setOf((Object[]) new Integer[]{7, 20});
    private static final int CONTROLLER_REQUEST_CODE = 1;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set getRetryables() {
            return CredentialProviderBaseController.retryables;
        }

        public final int getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release() {
            return CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        public final GetCredentialException getCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            return new NoCredentialException(str2);
                        }
                    } else if (str.equals("GET_INTERRUPTED")) {
                        return new GetCredentialInterruptedException(str2);
                    }
                } else if (str.equals("GET_CANCELED_TAG")) {
                    return new GetCredentialCancellationException(str2);
                }
            }
            return new GetCredentialUnknownException(str2);
        }

        public final void reportError$credentials_play_services_auth_release(ResultReceiver resultReceiver, String errName, String errMsg) {
            Intrinsics.checkNotNullParameter(resultReceiver, "<this>");
            Intrinsics.checkNotNullParameter(errName, "errName");
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            Bundle bundle = new Bundle();
            bundle.putBoolean("FAILURE_RESPONSE", true);
            bundle.putString("EXCEPTION_TYPE", errName);
            bundle.putString("EXCEPTION_MESSAGE", errMsg);
            resultReceiver.send(ConnectionsManager.DEFAULT_DATACENTER_ID, bundle);
        }

        public final void reportResult$credentials_play_services_auth_release(ResultReceiver resultReceiver, int i, int i2, Intent intent) {
            Intrinsics.checkNotNullParameter(resultReceiver, "<this>");
            Bundle bundle = new Bundle();
            bundle.putBoolean("FAILURE_RESPONSE", false);
            bundle.putInt("ACTIVITY_REQUEST_CODE", i);
            bundle.putParcelable("RESULT_DATA", intent);
            resultReceiver.send(i2, bundle);
        }

        public final CreateCredentialException createCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (Intrinsics.areEqual(str, "CREATE_CANCELED")) {
                return new CreateCredentialCancellationException(str2);
            }
            if (Intrinsics.areEqual(str, "CREATE_INTERRUPTED")) {
                return new CreateCredentialInterruptedException(str2);
            }
            return new CreateCredentialUnknownException(str2);
        }
    }

    public CredentialProviderBaseController(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final ResultReceiver toIpcFriendlyResultReceiver(ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        Intrinsics.checkNotNull(resultReceiver);
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }

    public final void generateHiddenActivityIntent(ResultReceiver resultReceiver, Intent hiddenIntent, String typeTag) {
        Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
        Intrinsics.checkNotNullParameter(hiddenIntent, "hiddenIntent");
        Intrinsics.checkNotNullParameter(typeTag, "typeTag");
        hiddenIntent.putExtra("TYPE", typeTag);
        hiddenIntent.putExtra("ACTIVITY_REQUEST_CODE", CONTROLLER_REQUEST_CODE);
        hiddenIntent.putExtra("RESULT_RECEIVER", toIpcFriendlyResultReceiver(resultReceiver));
        hiddenIntent.setFlags(65536);
    }
}
