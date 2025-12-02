package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
/* synthetic */ class CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 extends FunctionReferenceImpl implements Function2 {
    CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final CreateCredentialException invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
