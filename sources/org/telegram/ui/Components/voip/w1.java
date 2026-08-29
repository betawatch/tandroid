package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.wk;
import org.telegram.ui.ao0;
import org.telegram.ui.th;
import th.w3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements MessagesStorage.BooleanCallback, org.telegram.ui.ActionBar.b2, ao0, wk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.ao0
    public void a(int i10) {
        ph.k2 k2Var = (ph.k2) this.b;
        vc0 vc0Var = (vc0) this.c;
        String str = (String) this.d;
        if (i10 != 3) {
            vc0Var.dismiss();
        }
        k2Var.d.x.C(str, th.B(i10).toLowerCase(Locale.ROOT), false);
    }

    @Override // org.telegram.ui.Components.wk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.a) {
            case 5:
                th.p pVar = (th.p) this.b;
                th.a aVar = (th.a) this.c;
                ni niVar = (ni) this.d;
                th.p3 p3Var = pVar.r;
                if (messageMedia != null && messageMedia.geo != null) {
                    th.b2 b2Var = p3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.w = 600;
                        pageblockmap.h = 400;
                    }
                    th.b2 b2Var2 = p3Var.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    pVar.V(true);
                    niVar.dismiss(true);
                    p3Var.post(new th.f(pVar, aVar, 0));
                    break;
                }
                break;
            default:
                th.x1 x1Var = (th.x1) this.b;
                th.a aVar2 = (th.a) this.c;
                ni niVar2 = (ni) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    th.b2 b2Var3 = x1Var.L.F3;
                    if (b2Var3 != null) {
                        b2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.w = 600;
                        pageblockmap2.h = 400;
                    }
                    th.b2 b2Var4 = x1Var.L.F3;
                    if (b2Var4 != null) {
                        b2Var4.h();
                    }
                    niVar2.dismiss(true);
                    x1Var.L.post(new th.i1(x1Var, aVar2, 9));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                boolean[] zArr = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                st stVar = (st) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.confirm(stVar.getText().toString());
                    break;
                }
                break;
            case 2:
                Activity activity = (Activity) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                zArr2[0] = true;
                Boolean bool = Boolean.FALSE;
                sVar.run(bool, bool);
                break;
            case 3:
            default:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                w3 w3Var = (w3) this.d;
                String trim = editTextBoldCursor.getText().toString().trim();
                String trim2 = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = w3Var.a;
                    th.m3 m3Var = w3Var.b;
                    switch (i11) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            m3Var.a(trim, tL_inlineButtonTypeUrl);
                            break;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            m3Var.a(trim, tL_inlineButtonTypeCopy);
                            break;
                    }
                }
                break;
            case 4:
                rf.v0 v0Var = (rf.v0) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                v0Var.getClass();
                zArr3[0] = true;
                if (user != null) {
                    MessagesController.getNotificationsSettings(v0Var.f).edit().putBoolean("inlinegeo_" + user.id, true).commit();
                    v0Var.G();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
        h2.m(chat, null, true, null, o2Var.getParentActivity(), o2Var, (AccountInstance) this.d);
    }
}
