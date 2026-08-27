package gg;

import ag.n0;
import ag.r2;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import cg.w1;
import gh.d4;
import gh.i0;
import gh.j3;
import gh.t3;
import gh.v;
import hh.e7;
import hh.fa;
import hh.m5;
import hh.m6;
import hh.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jh.c5;
import jh.e4;
import jh.i9;
import jh.m4;
import jh.x3;
import lh.h5;
import lh.i3;
import lh.ib;
import lh.l3;
import lh.o9;
import lh.p3;
import lh.s;
import lh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.ce;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.q;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.v2;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.rn;
import yf.r0;
import yf.x;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        boolean G1;
        fb0 fb0Var;
        int i10 = 5;
        int i11 = 4;
        CharSequence charSequence = null;
        final int i12 = 0;
        switch (this.a) {
            case 0:
                ((l) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                break;
            case 1:
                gh.f fVar = (gh.f) this.b;
                new v((Context) this.c, null, null, (GiftAuctionController.Auction) this.d).show();
                fVar.dismiss();
                break;
            case 2:
                v.R((v) this.b, (boolean[]) this.c, (c6) this.d);
                break;
            case 3:
                i0.R((i0) this.b, (Context) this.c, (c6) this.d);
                break;
            case 4:
                i0.P((i0) this.b, (boolean[]) this.c, (c6) this.d);
                break;
            case 5:
                t3 t3Var = (t3) this.b;
                b70 b70Var = (b70) this.c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.d;
                b70Var.u();
                wq0 wq0Var = t3Var.a;
                j3 j3Var = new j3(t3Var, savedStarGift, i12);
                HashMap hashMap = d4.P;
                wq0Var.h(null, j3Var);
                break;
            case 6:
                o0 o0Var = (o0) this.b;
                Context context = (Context) this.c;
                c6 c6Var = (c6) this.d;
                if (o0Var.i0.a == hf.b.a) {
                    new fa(context, c6Var).show();
                    break;
                }
                break;
            case 7:
                m6 m6Var = (m6) this.b;
                final e3 e3Var = (e3) this.c;
                final lh.d dVar = (lh.d) this.d;
                e3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                m6Var.run(new Utilities.Callback() { // from class: hh.o8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i12) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                                if (!booleanValue) {
                                    final int i13 = 0;
                                    final lh.d dVar2 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.y8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    e3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    e3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    e3Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var3 = e3Var;
                                if (!booleanValue2) {
                                    final int i14 = 1;
                                    final lh.d dVar3 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.y8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    e3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    e3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    e3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 8:
                e7 e7Var = (e7) this.b;
                final e3 e3Var2 = (e3) this.c;
                final lh.d dVar2 = (lh.d) this.d;
                e3Var2.setCanDismissWithSwipe(false);
                final int i13 = 1;
                dVar2.setLoading(true);
                e7Var.run(new Utilities.Callback() { // from class: hh.o8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i13) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var22 = e3Var2;
                                if (!booleanValue) {
                                    final int i132 = 0;
                                    final lh.d dVar22 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.y8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i132) {
                                                case 0:
                                                    e3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    e3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    e3Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var3 = e3Var2;
                                if (!booleanValue2) {
                                    final int i14 = 1;
                                    final lh.d dVar3 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.y8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    e3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    e3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    e3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 9:
                n0 n0Var = (n0) this.b;
                long[] jArr = (long[]) this.c;
                e3 e3Var3 = (e3) this.d;
                n0Var.run(Long.valueOf(jArr[0]));
                e3Var3.dismiss();
                break;
            case 10:
                x3 x3Var = (x3) this.b;
                o9 o9Var = (o9) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                e4 e4Var = x3Var.l;
                e4Var.F0(o9Var, storyItem);
                x3 x3Var2 = e4Var.p1;
                if (x3Var2 != null) {
                    x3Var2.a();
                    break;
                }
                break;
            case 11:
                x3 x3Var3 = (x3) this.b;
                f1 f1Var = (f1) this.c;
                i9 i9Var = (i9) this.d;
                f1Var.performHapticFeedback(3);
                mc X = mc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new m5(23, x3Var3, i9Var))).j();
                    break;
                }
                break;
            case 12:
                m4 m4Var = (m4) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                b70 b70Var2 = (b70) this.d;
                r2 r2Var = new r2(m4Var, i10);
                c5 c5Var = m4Var.b;
                new cv(r2Var, c5Var.getContext(), c5Var.s, arrayList).show();
                b70Var2.u();
                break;
            case 13:
                ib ibVar = (ib) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                jh.b bVar = (jh.b) this.d;
                b70 b70Var3 = ibVar.R0;
                if (b70Var3 == null || !b70Var3.D()) {
                    lh.o oVar = new lh.o(ibVar, i12);
                    boolean isPremium = UserConfig.getInstance(ibVar.Q).isPremium();
                    lh.o oVar2 = isPremium ? null : new lh.o(ibVar, 1);
                    b70 F = b70.F(frameLayout, bVar, ibVar.P0);
                    ibVar.R0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    ibVar.R0.k();
                    int i14 = 0;
                    while (true) {
                        int[] iArr = s.M1;
                        if (i14 >= 4) {
                            b70 b70Var4 = ibVar.R0;
                            b70Var4.s = 0;
                            b70Var4.Z();
                            break;
                        } else {
                            int i15 = iArr[i14];
                            b70 b70Var5 = ibVar.R0;
                            String string = i15 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i15 / 3600, new Object[0]);
                            int i16 = g6.E8;
                            b70Var5.b(0, null, string, i16, i16, new w1(oVar, i15, 7));
                            b70Var5.M((isPremium || i15 == 86400 || i15 == Integer.MAX_VALUE) ? null : new w1(oVar2, i15, 8));
                            if (ibVar.T0 == i14) {
                                ibVar.R0.L();
                            }
                            i14++;
                        }
                    }
                }
                break;
            case 14:
                i3 i3Var = (i3) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                l3 l3Var = (l3) this.d;
                p3 p3Var = i3Var.c;
                ArrayList arrayList2 = p3Var.d0;
                if (arrayList2.contains(photoEntry)) {
                    arrayList2.remove(photoEntry);
                } else if (arrayList2.size() + 1 > p3Var.N) {
                    int i17 = -p3Var.J;
                    p3Var.J = i17;
                    AndroidUtilities.shakeViewSpring(l3Var, i17);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    break;
                } else {
                    arrayList2.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(p3Var.d);
                p3Var.j();
                break;
            case 15:
                va vaVar = (va) this.b;
                Context context2 = (Context) this.c;
                r0 r0Var = (r0) this.d;
                if (!vaVar.x1) {
                    Runnable runnable2 = vaVar.G1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    x xVar = new x(context2, vaVar.C1);
                    vaVar.P1 = xVar;
                    xVar.m(vaVar.w1.a, 2);
                    xVar.n = new h5(vaVar, r0Var);
                    xVar.h = new cg.n0(i11, vaVar, r0Var);
                    xVar.show();
                    break;
                }
                break;
            case 16:
                q.P((q) this.b, (TL_aicompose.AiComposeTone) this.c, (c6) this.d);
                break;
            case 17:
                boolean[] zArr = (boolean[]) this.b;
                x4 x4Var = (x4) this.c;
                z2 z2Var = (z2) this.d;
                zArr[0] = false;
                x4Var.I(-1, 0, true);
                runnable = z2Var.a.dismissRunnable;
                runnable.run();
                break;
            case 18:
                b2[] b2VarArr = (b2[]) this.b;
                Runnable runnable3 = (Runnable) this.d;
                v4 v4Var = (v4) this.c;
                b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnDismissListener(null);
                }
                runnable3.run();
                v4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 19:
                ArrayList arrayList3 = (ArrayList) this.b;
                Runnable runnable4 = (Runnable) this.d;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.c;
                SharedConfig.setSecretMapPreviewType(((Integer) arrayList3.get(((Integer) view.getTag()).intValue())).intValue());
                runnable4.run();
                alertDialog$Builder.a.H0.run();
                break;
            case 20:
                ((a8) this.b).n.B0((org.telegram.ui.Cells.x) this.c, (MessageObject) this.d);
                break;
            case 21:
                gi giVar = (gi) this.b;
                n2 n2Var = (n2) this.c;
                c6 c6Var2 = (c6) this.d;
                n2 n2Var2 = giVar.b0;
                int i18 = giVar.F1;
                rh rhVar = giVar.E0;
                ye yeVar = giVar.d0;
                long k10 = yeVar != null ? yeVar.k() : 0L;
                giVar.J0 = k10;
                rhVar.setEffect(k10);
                giVar.forceKeyboardOnDismiss();
                if (giVar.G - giVar.H < 0) {
                    AndroidUtilities.shakeView(giVar.s);
                    AndroidUtilities.shakeView(giVar.v);
                    try {
                        rhVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && MessagesController.getInstance(i18).captionLengthLimitPremium > giVar.H) {
                        giVar.O1(n2Var);
                    }
                    ye yeVar2 = giVar.d0;
                    if (yeVar2 != null) {
                        yeVar2.h(false);
                        giVar.d0 = null;
                        break;
                    }
                } else {
                    if (giVar.D1 == null && (n2Var2 instanceof rn)) {
                        rn rnVar = (rn) n2Var2;
                        if (rnVar.c()) {
                            y4.M(giVar.getContext(), rnVar.a(), new d3.e(giVar, k10, i11), c6Var2);
                            giVar.H1(false, false);
                            break;
                        }
                    }
                    yh yhVar = giVar.u0;
                    if (yhVar == giVar.f0 || yhVar == giVar.m0) {
                        G1 = giVar.G1(0, true, 0, giVar.s1(), k10);
                    } else {
                        if (!yhVar.I(0, true, 0, giVar.s1(), k10)) {
                            giVar.w2 = true;
                            giVar.dismiss();
                        }
                        G1 = false;
                    }
                    ye yeVar3 = giVar.d0;
                    if (yeVar3 != null) {
                        yeVar3.h(!G1);
                        giVar.d0 = null;
                    }
                    giVar.H1(false, false);
                }
                break;
            case 22:
                gi giVar2 = (gi) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                fb0 fb0Var2 = (fb0) this.d;
                giVar2.H1(!giVar2.Y, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z10 = giVar2.Y;
                message.invert_media = z10;
                fb0Var2.a(!z10, true);
                giVar2.d0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar2.f0;
                if (chatAttachAlertPhotoLayout != null && (fb0Var = chatAttachAlertPhotoLayout.Z0) != null) {
                    fb0Var.a(!giVar2.Y, true);
                }
                giVar2.d0.n(!giVar2.Y);
                break;
            case 23:
                ar arVar = (ar) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                lh.d dVar3 = (lh.d) this.d;
                callback.run(new we.d(new lp(dVar3, i11), new xq(i12, arVar, dVar3)));
                break;
            case 24:
                yq yqVar = (yq) this.b;
                Context context3 = (Context) this.c;
                v8 v8Var = (v8) this.d;
                yqVar.getClass();
                AndroidUtilities.addToClipboard(v8Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 25:
                lt ltVar = (lt) this.b;
                hh.o oVar3 = (hh.o) this.c;
                cg.j jVar = (cg.j) this.d;
                try {
                    charSequence = ((ClipboardManager) ltVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ltVar.getContext());
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (charSequence != null) {
                    oVar3.setText(charSequence);
                    oVar3.setSelection(0, oVar3.getText().length());
                }
                jVar.run();
                break;
            case 26:
                tt ttVar = (tt) this.b;
                zu0 zu0Var = (zu0) this.c;
                c6 c6Var3 = (c6) this.d;
                ot otVar = ttVar.a;
                ce ceVar = ttVar.b;
                if (ceVar.isEnabled() && ceVar.getAlpha() >= 0.5f) {
                    p1 p1Var = ttVar.G;
                    if (p1Var == null || !p1Var.f) {
                        if (!ttVar.n) {
                            if (!ttVar.e) {
                                ttVar.x(1);
                                boolean isFocused = otVar.isFocused();
                                ttVar.d.F(otVar.length() > 0, false);
                                otVar.requestFocus();
                                if (!isFocused) {
                                    otVar.setSelection(otVar.length());
                                    break;
                                }
                            } else {
                                if (ttVar.x) {
                                    ttVar.k(true);
                                    ttVar.x = false;
                                    ttVar.p();
                                }
                                ttVar.v();
                                break;
                            }
                        } else {
                            otVar.hideActionMode();
                            b70 b70Var6 = new b70(zu0Var, c6Var3, ceVar, false, false, true);
                            b70Var6.X = AndroidUtilities.dp(280.0f);
                            otVar.extendActionMode(null, new ba0(b70Var6, new v2(otVar, i11), otVar.getOnPremiumMenuLockClickListener()));
                            b70Var6.U = true;
                            b70Var6.Z();
                            break;
                        }
                    }
                }
                break;
            case 27:
                b20 b20Var = (b20) this.b;
                Context context4 = (Context) this.c;
                n2 n2Var3 = (n2) this.d;
                b20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context4);
                alertDialog$Builder2.a.N = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new vu(b20Var, i10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                n2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 28:
                i80 i80Var = (i80) this.b;
                e3 e3Var4 = (e3) this.c;
                n2 n2Var4 = (n2) this.d;
                try {
                    if (i80Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", i80Var.b));
                        if (e3Var4 == null || e3Var4.getContainer() == null) {
                            mc.j(n2Var4).j();
                        } else {
                            new mc(e3Var4.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            default:
                ab0 ab0Var = (ab0) this.b;
                fb0 fb0Var3 = (fb0) this.c;
                fb0 fb0Var4 = (fb0) this.d;
                gb0 gb0Var = ab0Var.V;
                MessagePreviewParams messagePreviewParams = gb0Var.d;
                boolean z11 = messagePreviewParams.hideCaption;
                boolean z12 = !z11;
                messagePreviewParams.hideCaption = z12;
                if (z11) {
                    if (gb0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    gb0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    gb0Var.x = true;
                }
                fb0Var3.a(z12, true);
                fb0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                ab0Var.h();
                ab0Var.k(true);
                break;
        }
    }

    public /* synthetic */ f(Object obj, Runnable runnable, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = runnable;
        this.c = obj2;
    }
}
