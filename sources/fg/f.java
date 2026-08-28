package fg;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import bg.c2;
import bg.i1;
import bg.r0;
import fh.j4;
import fh.k0;
import fh.o3;
import fh.x;
import fh.y3;
import gh.f7;
import gh.fa;
import gh.n6;
import gh.o0;
import h3.g0;
import ih.b4;
import ih.g5;
import ih.i4;
import ih.m9;
import ih.q4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kh.i5;
import kh.j3;
import kh.m3;
import kh.mb;
import kh.q3;
import kh.r9;
import kh.s;
import kh.ya;
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
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.q;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.v2;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.zq;
import org.telegram.ui.qn;
import xf.s0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean G1;
        bb0 bb0Var;
        int i9 = 4;
        CharSequence charSequence = null;
        final int i10 = 0;
        switch (this.a) {
            case 0:
                ((m) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                break;
            case 1:
                fh.f fVar = (fh.f) this.b;
                new x((Context) this.c, null, null, (GiftAuctionController.Auction) this.d).show();
                fVar.dismiss();
                break;
            case 2:
                x.Q((x) this.b, (boolean[]) this.c, (b6) this.d);
                break;
            case 3:
                k0.Q((k0) this.b, (Context) this.c, (b6) this.d);
                break;
            case 4:
                k0.O((k0) this.b, (boolean[]) this.c, (b6) this.d);
                break;
            case 5:
                y3 y3Var = (y3) this.b;
                x60 x60Var = (x60) this.c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.d;
                x60Var.u();
                vq0 vq0Var = y3Var.a;
                o3 o3Var = new o3(y3Var, savedStarGift, i10);
                HashMap hashMap = j4.P;
                vq0Var.h(null, o3Var);
                break;
            case 6:
                o0 o0Var = (o0) this.b;
                Context context = (Context) this.c;
                b6 b6Var = (b6) this.d;
                if (o0Var.i0.a == gf.b.a) {
                    new fa(context, b6Var).show();
                    break;
                }
                break;
            case 7:
                n6 n6Var = (n6) this.b;
                final f3 f3Var = (f3) this.c;
                final kh.d dVar = (kh.d) this.d;
                f3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                n6Var.run(new Utilities.Callback() { // from class: gh.p8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i10) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                                if (!booleanValue) {
                                    final int i11 = 0;
                                    final kh.d dVar2 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.z8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    f3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    f3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    f3Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var3 = f3Var;
                                if (!booleanValue2) {
                                    final int i12 = 1;
                                    final kh.d dVar3 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.z8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    f3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    f3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    f3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 8:
                f7 f7Var = (f7) this.b;
                final f3 f3Var2 = (f3) this.c;
                final kh.d dVar2 = (kh.d) this.d;
                f3Var2.setCanDismissWithSwipe(false);
                final int i11 = 1;
                dVar2.setLoading(true);
                f7Var.run(new Utilities.Callback() { // from class: gh.p8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i11) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var22 = f3Var2;
                                if (!booleanValue) {
                                    final int i112 = 0;
                                    final kh.d dVar22 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.z8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i112) {
                                                case 0:
                                                    f3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    f3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    f3Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var3 = f3Var2;
                                if (!booleanValue2) {
                                    final int i12 = 1;
                                    final kh.d dVar3 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.z8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    f3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    f3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    f3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 9:
                bg.i iVar = (bg.i) this.b;
                long[] jArr = (long[]) this.c;
                f3 f3Var3 = (f3) this.d;
                iVar.run(Long.valueOf(jArr[0]));
                f3Var3.dismiss();
                break;
            case 10:
                b4 b4Var = (b4) this.b;
                r9 r9Var = (r9) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                i4 i4Var = b4Var.l;
                i4Var.F0(r9Var, storyItem);
                b4 b4Var2 = i4Var.p1;
                if (b4Var2 != null) {
                    b4Var2.a();
                    break;
                }
                break;
            case 11:
                b4 b4Var3 = (b4) this.b;
                g1 g1Var = (g1) this.c;
                m9 m9Var = (m9) this.d;
                g1Var.performHapticFeedback(3);
                oc X = oc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new g0(14, b4Var3, m9Var))).j();
                    break;
                }
                break;
            case 12:
                q4 q4Var = (q4) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                x60 x60Var2 = (x60) this.d;
                i1 i1Var = new i1(q4Var, i9);
                g5 g5Var = q4Var.b;
                new dv(i1Var, g5Var.getContext(), g5Var.s, arrayList).show();
                x60Var2.u();
                break;
            case 13:
                mb mbVar = (mb) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                ih.b bVar = (ih.b) this.d;
                x60 x60Var3 = mbVar.R0;
                if (x60Var3 == null || !x60Var3.D()) {
                    kh.o oVar = new kh.o(mbVar, i10);
                    boolean isPremium = UserConfig.getInstance(mbVar.Q).isPremium();
                    kh.o oVar2 = isPremium ? null : new kh.o(mbVar, 1);
                    x60 F = x60.F(frameLayout, bVar, mbVar.P0);
                    mbVar.R0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    mbVar.R0.k();
                    int i12 = 0;
                    while (true) {
                        int[] iArr = s.M1;
                        if (i12 >= 4) {
                            x60 x60Var4 = mbVar.R0;
                            x60Var4.s = 0;
                            x60Var4.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            x60 x60Var5 = mbVar.R0;
                            String string = i13 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]);
                            int i14 = f6.E8;
                            x60Var5.b(0, null, string, i14, i14, new c2(oVar, i13, 7));
                            x60Var5.M((isPremium || i13 == 86400 || i13 == Integer.MAX_VALUE) ? null : new c2(oVar2, i13, 8));
                            if (mbVar.T0 == i12) {
                                mbVar.R0.L();
                            }
                            i12++;
                        }
                    }
                }
                break;
            case 14:
                j3 j3Var = (j3) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                m3 m3Var = (m3) this.d;
                q3 q3Var = j3Var.c;
                ArrayList arrayList2 = q3Var.d0;
                if (arrayList2.contains(photoEntry)) {
                    arrayList2.remove(photoEntry);
                } else if (arrayList2.size() + 1 > q3Var.N) {
                    int i15 = -q3Var.J;
                    q3Var.J = i15;
                    AndroidUtilities.shakeViewSpring(m3Var, i15);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    break;
                } else {
                    arrayList2.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(q3Var.d);
                q3Var.j();
                break;
            case 15:
                ya yaVar = (ya) this.b;
                Context context2 = (Context) this.c;
                s0 s0Var = (s0) this.d;
                if (!yaVar.x1) {
                    Runnable runnable = yaVar.G1;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    xf.x xVar = new xf.x(context2, yaVar.C1);
                    yaVar.P1 = xVar;
                    xVar.m(yaVar.w1.a, 2);
                    xVar.n = new i5(yaVar, s0Var);
                    xVar.h = new r0(i9, yaVar, s0Var);
                    xVar.show();
                    break;
                }
                break;
            case 16:
                q.O((q) this.b, (TL_aicompose.AiComposeTone) this.c, (b6) this.d);
                break;
            case 17:
                boolean[] zArr = (boolean[]) this.b;
                x4 x4Var = (x4) this.c;
                a3 a3Var = (a3) this.d;
                zArr[0] = false;
                x4Var.B(-1, 0, true);
                a3Var.a.dismissRunnable.run();
                break;
            case 18:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.b;
                Runnable runnable2 = (Runnable) this.d;
                v4 v4Var = (v4) this.c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    c2Var.setOnDismissListener(null);
                }
                runnable2.run();
                v4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 19:
                ArrayList arrayList3 = (ArrayList) this.b;
                Runnable runnable3 = (Runnable) this.d;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.c;
                SharedConfig.setSecretMapPreviewType(((Integer) arrayList3.get(((Integer) view.getTag()).intValue())).intValue());
                runnable3.run();
                alertDialog$Builder.a.H0.run();
                break;
            case 20:
                ((b8) this.b).n.A0((org.telegram.ui.Cells.x) this.c, (MessageObject) this.d);
                break;
            case 21:
                ki kiVar = (ki) this.b;
                o2 o2Var = (o2) this.c;
                b6 b6Var2 = (b6) this.d;
                o2 o2Var2 = kiVar.b0;
                int i16 = kiVar.F1;
                vh vhVar = kiVar.E0;
                cf cfVar = kiVar.d0;
                long k10 = cfVar != null ? cfVar.k() : 0L;
                kiVar.J0 = k10;
                vhVar.setEffect(k10);
                kiVar.forceKeyboardOnDismiss();
                if (kiVar.G - kiVar.H < 0) {
                    AndroidUtilities.shakeView(kiVar.s);
                    AndroidUtilities.shakeView(kiVar.v);
                    try {
                        vhVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i16).premiumFeaturesBlocked() && MessagesController.getInstance(i16).captionLengthLimitPremium > kiVar.H) {
                        kiVar.O1(o2Var);
                    }
                    cf cfVar2 = kiVar.d0;
                    if (cfVar2 != null) {
                        cfVar2.h(false);
                        kiVar.d0 = null;
                        break;
                    }
                } else {
                    if (kiVar.D1 == null && (o2Var2 instanceof qn)) {
                        qn qnVar = (qn) o2Var2;
                        if (qnVar.c()) {
                            y4.M(kiVar.getContext(), qnVar.a(), new d3.e(kiVar, k10, i9), b6Var2);
                            kiVar.H1(false, false);
                            break;
                        }
                    }
                    ci ciVar = kiVar.u0;
                    if (ciVar == kiVar.f0 || ciVar == kiVar.m0) {
                        G1 = kiVar.G1(0, true, 0, kiVar.s1(), k10);
                    } else {
                        if (!ciVar.H(0, true, 0, kiVar.s1(), k10)) {
                            kiVar.w2 = true;
                            kiVar.dismiss();
                        }
                        G1 = false;
                    }
                    cf cfVar3 = kiVar.d0;
                    if (cfVar3 != null) {
                        cfVar3.h(!G1);
                        kiVar.d0 = null;
                    }
                    kiVar.H1(false, false);
                }
                break;
            case 22:
                ki kiVar2 = (ki) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                bb0 bb0Var2 = (bb0) this.d;
                kiVar2.H1(!kiVar2.Y, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z10 = kiVar2.Y;
                message.invert_media = z10;
                bb0Var2.a(!z10, true);
                kiVar2.d0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar2.f0;
                if (chatAttachAlertPhotoLayout != null && (bb0Var = chatAttachAlertPhotoLayout.Z0) != null) {
                    bb0Var.a(!kiVar2.Y, true);
                }
                kiVar2.d0.n(!kiVar2.Y);
                break;
            case 23:
                cr crVar = (cr) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                kh.d dVar3 = (kh.d) this.d;
                callback.run(new ve.d(new np(dVar3, i9), new zq(i10, crVar, dVar3)));
                break;
            case 24:
                ar arVar = (ar) this.b;
                Context context3 = (Context) this.c;
                z8 z8Var = (z8) this.d;
                arVar.getClass();
                AndroidUtilities.addToClipboard(z8Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 25:
                mt mtVar = (mt) this.b;
                gh.o oVar3 = (gh.o) this.c;
                bg.m mVar = (bg.m) this.d;
                try {
                    charSequence = ((ClipboardManager) mtVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(mtVar.getContext());
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (charSequence != null) {
                    oVar3.setText(charSequence);
                    oVar3.setSelection(0, oVar3.getText().length());
                }
                mVar.run();
                break;
            case 26:
                ut utVar = (ut) this.b;
                xu0 xu0Var = (xu0) this.c;
                b6 b6Var3 = (b6) this.d;
                pt ptVar = utVar.a;
                ge geVar = utVar.b;
                if (geVar.isEnabled() && geVar.getAlpha() >= 0.5f) {
                    q1 q1Var = utVar.G;
                    if (q1Var == null || !q1Var.f) {
                        if (!utVar.n) {
                            if (!utVar.e) {
                                utVar.x(1);
                                boolean isFocused = ptVar.isFocused();
                                utVar.d.E(ptVar.length() > 0, false);
                                ptVar.requestFocus();
                                if (!isFocused) {
                                    ptVar.setSelection(ptVar.length());
                                    break;
                                }
                            } else {
                                if (utVar.x) {
                                    utVar.k(true);
                                    utVar.x = false;
                                    utVar.p();
                                }
                                utVar.v();
                                break;
                            }
                        } else {
                            ptVar.hideActionMode();
                            x60 x60Var6 = new x60(xu0Var, b6Var3, geVar, false, false, true);
                            x60Var6.X = AndroidUtilities.dp(280.0f);
                            ptVar.extendActionMode(null, new x90(x60Var6, new v2(ptVar, i9), ptVar.getOnPremiumMenuLockClickListener()));
                            x60Var6.U = true;
                            x60Var6.Z();
                            break;
                        }
                    }
                }
                break;
            case 27:
                y10 y10Var = (y10) this.b;
                Context context4 = (Context) this.c;
                o2 o2Var3 = (o2) this.d;
                y10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context4);
                alertDialog$Builder2.a.N = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new wu(y10Var, 5));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                o2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 28:
                e80 e80Var = (e80) this.b;
                f3 f3Var4 = (f3) this.c;
                o2 o2Var4 = (o2) this.d;
                try {
                    if (e80Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", e80Var.b));
                        if (f3Var4 == null || f3Var4.getContainer() == null) {
                            oc.j(o2Var4).j();
                        } else {
                            new oc(f3Var4.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                break;
            default:
                wa0 wa0Var = (wa0) this.b;
                bb0 bb0Var3 = (bb0) this.c;
                bb0 bb0Var4 = (bb0) this.d;
                cb0 cb0Var = wa0Var.V;
                MessagePreviewParams messagePreviewParams = cb0Var.d;
                boolean z11 = messagePreviewParams.hideCaption;
                boolean z12 = !z11;
                messagePreviewParams.hideCaption = z12;
                if (z11) {
                    if (cb0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    cb0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    cb0Var.x = true;
                }
                bb0Var3.a(z12, true);
                bb0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                wa0Var.h();
                wa0Var.k(true);
                break;
        }
    }

    public /* synthetic */ f(Object obj, Runnable runnable, Object obj2, int i9) {
        this.a = i9;
        this.b = obj;
        this.d = runnable;
        this.c = obj2;
    }
}
