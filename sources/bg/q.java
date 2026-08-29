package bg;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jh.c7;
import jh.k6;
import jh.z9;
import lh.c5;
import lh.i9;
import lh.m4;
import nh.c9;
import nh.ja;
import nh.wa;
import nh.y4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.je;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.z4;
import org.telegram.ui.tn;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        boolean G1;
        qb0 qb0Var;
        int i10 = 5;
        int i11 = 4;
        CharSequence charSequence = null;
        final int i12 = 0;
        switch (this.a) {
            case 0:
                ws0 ws0Var = (ws0) this.b;
                Context context = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!ws0Var.H1) {
                    Runnable runnable2 = ws0Var.Q1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    ag.f0 f0Var = new ag.f0(context, ws0Var.M1);
                    f0Var.m(ws0Var.G1.a, 2);
                    f0Var.n = new j0(ws0Var, bitmap);
                    f0Var.h = new p(ws0Var, 1);
                    f0Var.show();
                    break;
                }
                break;
            case 1:
                ((ig.k) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                break;
            case 2:
                ih.f fVar = (ih.f) this.b;
                new ih.t((Context) this.c, null, null, (GiftAuctionController.Auction) this.d).show();
                fVar.dismiss();
                break;
            case 3:
                ih.t.R((ih.t) this.b, (boolean[]) this.c, (c6) this.d);
                break;
            case 4:
                ih.g0.R((ih.g0) this.b, (Context) this.c, (c6) this.d);
                break;
            case 5:
                ih.g0.P((ih.g0) this.b, (boolean[]) this.c, (c6) this.d);
                break;
            case 6:
                ih.n3 n3Var = (ih.n3) this.b;
                j70 j70Var = (j70) this.c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.d;
                j70Var.u();
                gr0 gr0Var = n3Var.a;
                ih.d3 d3Var = new ih.d3(n3Var, savedStarGift, i12);
                HashMap hashMap = ih.x3.P;
                gr0Var.h(null, d3Var);
                break;
            case 7:
                jh.n0 n0Var = (jh.n0) this.b;
                Context context2 = (Context) this.c;
                c6 c6Var = (c6) this.d;
                if (n0Var.i0.a == kf.b.a) {
                    new z9(context2, c6Var).show();
                    break;
                }
                break;
            case 8:
                k6 k6Var = (k6) this.b;
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                final nh.d dVar = (nh.d) this.d;
                f3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                k6Var.run(new Utilities.Callback() { // from class: jh.l8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i12) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                                if (!booleanValue) {
                                    final int i13 = 0;
                                    final nh.d dVar2 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.u8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
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
                                    final int i14 = 1;
                                    final nh.d dVar3 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.u8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
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
                c7 c7Var = (c7) this.b;
                final org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.c;
                final nh.d dVar2 = (nh.d) this.d;
                f3Var2.setCanDismissWithSwipe(false);
                final int i13 = 1;
                dVar2.setLoading(true);
                c7Var.run(new Utilities.Callback() { // from class: jh.l8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i13) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var22 = f3Var2;
                                if (!booleanValue) {
                                    final int i132 = 0;
                                    final nh.d dVar22 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.u8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i132) {
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
                                    final int i14 = 1;
                                    final nh.d dVar3 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.u8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
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
            case 10:
                ag.i0 i0Var = (ag.i0) this.b;
                long[] jArr = (long[]) this.c;
                org.telegram.ui.ActionBar.f3 f3Var3 = (org.telegram.ui.ActionBar.f3) this.d;
                i0Var.run(Long.valueOf(jArr[0]));
                f3Var3.dismiss();
                break;
            case 11:
                lh.w3 w3Var = (lh.w3) this.b;
                c9 c9Var = (c9) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                lh.d4 d4Var = w3Var.l;
                d4Var.F0(c9Var, storyItem);
                lh.w3 w3Var2 = d4Var.p1;
                if (w3Var2 != null) {
                    w3Var2.a();
                    break;
                }
                break;
            case 12:
                lh.w3 w3Var3 = (lh.w3) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                i9 i9Var = (i9) this.d;
                g1Var.performHapticFeedback(3);
                tc X = tc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new lh.r3(i12, w3Var3, i9Var))).j();
                    break;
                }
                break;
            case 13:
                m4 m4Var = (m4) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                j70 j70Var2 = (j70) this.d;
                cg.z1 z1Var = new cg.z1(m4Var, i10);
                c5 c5Var = m4Var.b;
                new jv(z1Var, c5Var.getContext(), c5Var.s, arrayList).show();
                j70Var2.u();
                break;
            case 14:
                wa waVar = (wa) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                lh.b bVar = (lh.b) this.d;
                j70 j70Var3 = waVar.R0;
                if (j70Var3 == null || !j70Var3.D()) {
                    nh.o oVar = new nh.o(waVar, i12);
                    boolean isPremium = UserConfig.getInstance(waVar.Q).isPremium();
                    nh.o oVar2 = isPremium ? null : new nh.o(waVar, 1);
                    j70 F = j70.F(frameLayout, bVar, waVar.P0);
                    waVar.R0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    waVar.R0.k();
                    int i14 = 0;
                    while (true) {
                        int[] iArr = nh.r.M1;
                        if (i14 >= 4) {
                            j70 j70Var4 = waVar.R0;
                            j70Var4.s = 0;
                            j70Var4.Z();
                            break;
                        } else {
                            int i15 = iArr[i14];
                            j70 j70Var5 = waVar.R0;
                            String string = i15 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i15 / 3600, new Object[0]);
                            int i16 = g6.E8;
                            j70Var5.b(0, null, string, i16, i16, new f(oVar, i15, 10));
                            j70Var5.M((isPremium || i15 == 86400 || i15 == Integer.MAX_VALUE) ? null : new f(oVar2, i15, 11));
                            if (waVar.T0 == i14) {
                                waVar.R0.L();
                            }
                            i14++;
                        }
                    }
                }
                break;
            case 15:
                nh.g3 g3Var = (nh.g3) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                nh.j3 j3Var = (nh.j3) this.d;
                nh.n3 n3Var2 = g3Var.c;
                ArrayList arrayList2 = n3Var2.d0;
                if (arrayList2.contains(photoEntry)) {
                    arrayList2.remove(photoEntry);
                } else if (arrayList2.size() + 1 > n3Var2.N) {
                    int i17 = -n3Var2.J;
                    n3Var2.J = i17;
                    AndroidUtilities.shakeViewSpring(j3Var, i17);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    break;
                } else {
                    arrayList2.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(n3Var2.d);
                n3Var2.j();
                break;
            case 16:
                ja jaVar = (ja) this.b;
                Context context3 = (Context) this.c;
                ag.h1 h1Var = (ag.h1) this.d;
                if (!jaVar.x1) {
                    Runnable runnable3 = jaVar.G1;
                    if (runnable3 != null) {
                        runnable3.run();
                        break;
                    }
                } else {
                    ag.f0 f0Var2 = new ag.f0(context3, jaVar.C1);
                    jaVar.P1 = f0Var2;
                    f0Var2.m(jaVar.w1.a, 2);
                    f0Var2.n = new y4(jaVar, h1Var);
                    f0Var2.h = new eg.n0(i11, jaVar, h1Var);
                    f0Var2.show();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.s.P((org.telegram.ui.Components.s) this.b, (TL_aicompose.AiComposeTone) this.c, (c6) this.d);
                break;
            case 18:
                boolean[] zArr = (boolean[]) this.b;
                b5 b5Var = (b5) this.c;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                zArr[0] = false;
                b5Var.I(-1, 0, true);
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 19:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.b;
                Runnable runnable4 = (Runnable) this.c;
                z4 z4Var = (z4) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    c2Var.setOnDismissListener(null);
                }
                runnable4.run();
                z4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 20:
                ArrayList arrayList3 = (ArrayList) this.b;
                Runnable runnable5 = (Runnable) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                SharedConfig.setSecretMapPreviewType(((Integer) arrayList3.get(((Integer) view.getTag()).intValue())).intValue());
                runnable5.run();
                alertDialog$Builder.a.H0.run();
                break;
            case 21:
                ((f8) this.b).n.B0((org.telegram.ui.Cells.x) this.c, (MessageObject) this.d);
                break;
            case 22:
                ni niVar = (ni) this.b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                c6 c6Var2 = (c6) this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = niVar.b0;
                int i18 = niVar.F1;
                yh yhVar = niVar.E0;
                ff ffVar = niVar.d0;
                long k9 = ffVar != null ? ffVar.k() : 0L;
                niVar.J0 = k9;
                yhVar.setEffect(k9);
                niVar.forceKeyboardOnDismiss();
                if (niVar.G - niVar.H < 0) {
                    AndroidUtilities.shakeView(niVar.s);
                    AndroidUtilities.shakeView(niVar.v);
                    try {
                        yhVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && MessagesController.getInstance(i18).captionLengthLimitPremium > niVar.H) {
                        niVar.O1(o2Var);
                    }
                    ff ffVar2 = niVar.d0;
                    if (ffVar2 != null) {
                        ffVar2.h(false);
                        niVar.d0 = null;
                        break;
                    }
                } else {
                    if (niVar.D1 == null && (o2Var2 instanceof tn)) {
                        tn tnVar = (tn) o2Var2;
                        if (tnVar.c()) {
                            org.telegram.ui.Components.c5.M(niVar.getContext(), tnVar.a(), new f3.e(niVar, k9, i11), c6Var2);
                            niVar.H1(false, false);
                            break;
                        }
                    }
                    fi fiVar = niVar.u0;
                    if (fiVar == niVar.f0 || fiVar == niVar.m0) {
                        G1 = niVar.G1(0, true, 0, niVar.s1(), k9);
                    } else {
                        if (!fiVar.H(0, true, 0, niVar.s1(), k9)) {
                            niVar.w2 = true;
                            niVar.dismiss();
                        }
                        G1 = false;
                    }
                    ff ffVar3 = niVar.d0;
                    if (ffVar3 != null) {
                        ffVar3.h(!G1);
                        niVar.d0 = null;
                    }
                    niVar.H1(false, false);
                }
                break;
            case 23:
                ni niVar2 = (ni) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                qb0 qb0Var2 = (qb0) this.d;
                niVar2.H1(!niVar2.Y, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z10 = niVar2.Y;
                message.invert_media = z10;
                qb0Var2.a(!z10, true);
                niVar2.d0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar2.f0;
                if (chatAttachAlertPhotoLayout != null && (qb0Var = chatAttachAlertPhotoLayout.Z0) != null) {
                    qb0Var.a(!niVar2.Y, true);
                }
                niVar2.d0.n(!niVar2.Y);
                break;
            case 24:
                fr frVar = (fr) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                nh.d dVar3 = (nh.d) this.d;
                callback.run(new ye.c(new rp(dVar3, i11), new org.telegram.ui.Components.z2(27, frVar, dVar3)));
                break;
            case 25:
                dr drVar = (dr) this.b;
                Context context4 = (Context) this.c;
                w8 w8Var = (w8) this.d;
                drVar.getClass();
                AndroidUtilities.addToClipboard(w8Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context4, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 26:
                st stVar = (st) this.b;
                jh.m mVar = (jh.m) this.c;
                eg.j jVar = (eg.j) this.d;
                try {
                    charSequence = ((ClipboardManager) stVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(stVar.getContext());
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (charSequence != null) {
                    mVar.setText(charSequence);
                    mVar.setSelection(0, mVar.getText().length());
                }
                jVar.run();
                break;
            case 27:
                au auVar = (au) this.b;
                hv0 hv0Var = (hv0) this.c;
                c6 c6Var3 = (c6) this.d;
                vt vtVar = auVar.a;
                je jeVar = auVar.b;
                if (jeVar.isEnabled() && jeVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.q1 q1Var = auVar.G;
                    if (q1Var == null || !q1Var.f) {
                        if (!auVar.n) {
                            if (!auVar.e) {
                                auVar.x(1);
                                boolean isFocused = vtVar.isFocused();
                                auVar.d.E(vtVar.length() > 0, false);
                                vtVar.requestFocus();
                                if (!isFocused) {
                                    vtVar.setSelection(vtVar.length());
                                    break;
                                }
                            } else {
                                if (auVar.x) {
                                    auVar.k(true);
                                    auVar.x = false;
                                    auVar.p();
                                }
                                auVar.v();
                                break;
                            }
                        } else {
                            vtVar.hideActionMode();
                            j70 j70Var6 = new j70(hv0Var, c6Var3, jeVar, false, false, true);
                            j70Var6.X = AndroidUtilities.dp(280.0f);
                            vtVar.extendActionMode(null, new la0(j70Var6, new org.telegram.ui.Components.y2(vtVar, i11), vtVar.getOnPremiumMenuLockClickListener()));
                            j70Var6.U = true;
                            j70Var6.Z();
                            break;
                        }
                    }
                }
                break;
            case 28:
                j20 j20Var = (j20) this.b;
                Context context5 = (Context) this.c;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.d;
                j20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context5);
                alertDialog$Builder2.a.N = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new cv(j20Var, i10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                o2Var3.showDialog(alertDialog$Builder2.a);
                break;
            default:
                r80 r80Var = (r80) this.b;
                org.telegram.ui.ActionBar.f3 f3Var4 = (org.telegram.ui.ActionBar.f3) this.c;
                org.telegram.ui.ActionBar.o2 o2Var4 = (org.telegram.ui.ActionBar.o2) this.d;
                try {
                    if (r80Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", r80Var.b));
                        if (f3Var4 == null || f3Var4.getContainer() == null) {
                            tc.j(o2Var4).j();
                        } else {
                            new tc(f3Var4.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                break;
        }
    }
}
