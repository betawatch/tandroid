package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.service.media.MediaBrowserService;
import android.util.Pair;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.List;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.WriteToSocketDelegate;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements ResultCallback, WriteToSocketDelegate, OnSuccessListener, OnFailureListener, qh.p6, TelegramMediaSession.BrowseChildrenCallback, ImageReceiver.ImageReceiverDelegate, RequestTimeDelegate, OnCompleteListener, fo0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public void a(p2.h hVar, p2.q qVar) {
        BillingController.lambda$queryProductDetails$0((BillingController.ProductDetailsResponseListenerLegacy) this.b, hVar, qVar);
    }

    @Override // org.telegram.ui.Components.fo0
    public void b(float f10) {
        ((RichMessageLayout.RichAudioBlock) this.b).lambda$new$0(f10);
    }

    @Override // qh.p6
    public Bitmap c(BitmapFactory.Options options) {
        Bitmap lambda$rebuildPhoto$0;
        lambda$rebuildPhoto$0 = ((MediaController.PhotoEntry) this.b).lambda$rebuildPhoto$0(options);
        return lambda$rebuildPhoto$0;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        ((MusicPlayerService) this.b).lambda$onCreate$0(imageReceiver, z4, z10, z11);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        SendMessagesHelper.lambda$sendCallback$42((xn) this.b, d2Var, i10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((PushListenerController.GooglePushListenerServiceProvider) this.b).lambda$onRequestPushToken$0(task);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        int i10 = this.a;
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        LanguageDetector.lambda$detectLanguage$1((LanguageDetector.ExceptionCallback) this.b, exc);
    }

    @Override // org.telegram.messenger.TelegramMediaSession.BrowseChildrenCallback
    public void onResult(List list) {
        ((MediaBrowserService.Result) this.b).sendResult(list);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        LanguageDetector.lambda$detectLanguage$0((LanguageDetector.StringCallback) this.b, (String) obj);
    }

    @Override // org.telegram.tgnet.WriteToSocketDelegate
    public void run() {
        ((FileUploadOperation) this.b).lambda$startUploadRequest$8();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        switch (this.a) {
            case 1:
                ChatThemeController.lambda$loadWallpaperBitmap$9((Utilities.Callback) this.b, (Bitmap) obj);
                break;
            default:
                ((ChatThemeController) this.b).lambda$preloadAllWallpaperThumbs$5((Pair) obj);
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        int i10 = this.a;
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        ProxyRotationController.lambda$new$1((SharedConfig.ProxyInfo) this.b, j10);
    }

    @Override // org.telegram.ui.Components.fo0
    public /* synthetic */ void d(float f10) {
    }
}
