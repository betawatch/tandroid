package ai;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        ci.i4 i4Var;
        int i10 = this.a;
        int i11 = 7;
        v1 v1Var = null;
        CharSequence charSequence = null;
        v1Var = null;
        int i12 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                x.X((x) obj2, (Context) obj, view);
                break;
            case 1:
                b1 b1Var = (b1) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = b1.x0;
                    if (i13 >= 6) {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        r0 r0Var = new r0(b1Var, i12);
                        Pattern pattern = org.telegram.ui.Components.f5.a;
                        ig.e2 b10 = ig.e2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ji, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ni, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, (org.telegram.ui.ActionBar.g6) null, false);
                            h3Var.fixNavigationBar();
                            h3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            qd0 qd0Var = new qd0(context, null);
                            qd0Var.setAllItemsCount(6);
                            qd0Var.setItemCount(Math.min(6, 8));
                            qd0Var.setTextColor(x02);
                            qd0Var.setGravity(17);
                            qd0Var.setMinValue(0);
                            qd0Var.setMaxValue(5);
                            qd0Var.setValue(i14);
                            linearLayout.addView(qd0Var, w7.z5.l(1.0f, 0, 432));
                            qd0Var.setFormatter(new org.telegram.ui.Components.s(strArr, i11));
                            org.telegram.ui.Components.w4 w4Var = new org.telegram.ui.Components.w4(context, qd0Var);
                            w4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(x02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new di.d(10));
                            w4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                            w4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ei.d dVar = new ei.d(context, null, true);
                            dVar.i(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.k2(r3, 1));
                            w4Var.addView(dVar, w7.z5.t(-1, 48, 0, 16, 12, 16, 12));
                            h3Var.customView = w4Var;
                            h3Var.show();
                            h3Var.setOnDismissListener(new z3(9, r0Var, qd0Var));
                            h3Var.setBackgroundColor(x03);
                            h3Var.fixNavigationBar(x03);
                            org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
                            break;
                        }
                    } else {
                        strArr[i13] = LocaleController.formatPluralString("GiftOfferHours", iArr[i13] / 3600, new Object[0]);
                        if (iArr[i13] == b1Var.o0) {
                            i14 = i13;
                        }
                        i13++;
                    }
                }
                break;
            case 2:
                l1 l1Var = (l1) obj2;
                o2 o2Var = (o2) obj;
                ei.d dVar2 = l1Var.f;
                if (dVar2.c0 && !dVar2.Q) {
                    AndroidUtilities.hideKeyboard(l1Var.c);
                    dVar2.setLoading(true);
                    o2Var.run(l1Var.E);
                    break;
                }
                break;
            case 3:
                a2 a2Var = (a2) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList = (ArrayList) obj;
                s1 s1Var = a2Var.o0;
                int i15 = a2Var.E0;
                if (i15 != 2) {
                    if (i15 == 1) {
                        v1 v1Var2 = new v1(s1Var.getUpgradeBackdropAttribute(), s1Var.getUpgradePatternAttribute(), s1Var.getUpgradeImageViewAttribute());
                        a2Var.w0 = v1Var2;
                        s1Var.setPreviewAttributes(v1Var2);
                        a2Var.T(2);
                        break;
                    }
                } else {
                    s1Var.setPreviewingAttributes(arrayList);
                    a2Var.T(1);
                    break;
                }
                break;
            case 4:
                v1 v1Var3 = (v1) obj;
                a2 a2Var2 = ((t1) obj2).P;
                int i16 = a2Var2.E0;
                s1 s1Var2 = a2Var2.o0;
                if (i16 == 1) {
                    a2Var2.w0 = new v1(s1Var2.getUpgradeBackdropAttribute(), s1Var2.getUpgradePatternAttribute(), s1Var2.getUpgradeImageViewAttribute());
                    a2Var2.T(2);
                }
                int i17 = a2Var2.j0.s;
                v1 v1Var4 = a2Var2.w0;
                if (v1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = v1Var4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = v1Var4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = v1Var4.b;
                    if (i17 == 1) {
                        v1Var = new v1(v1Var3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i17 == 2) {
                        v1Var = new v1(stargiftattributebackdrop, v1Var3.b, stargiftattributemodel);
                    } else if (i17 == 0) {
                        v1Var = new v1(stargiftattributebackdrop, stargiftattributepattern, v1Var3.c);
                    }
                }
                a2Var2.w0 = v1Var;
                s1Var2.setPreviewAttributes(v1Var);
                a2Var2.V();
                break;
            case 5:
                l7 l7Var = (l7) obj2;
                boolean z10 = !l7Var.x1;
                l7Var.x1 = z10;
                ((org.telegram.ui.Cells.z1) obj).c(z10, true);
                break;
            case 6:
                pf.d.t(((l7) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url);
                break;
            case 7:
                ((l7) obj2).Q2((CharSequence) obj);
                break;
            case 8:
                e6 e6Var = (e6) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                if (e6Var.E.getAlpha() >= 1.0f && !e6Var.h0 && !e6Var.j0 && e6Var.d0 != null) {
                    new a2(e6Var.getContext(), g6Var, e6Var.W, e6Var.c0, e6Var.d0, true).show();
                    break;
                }
                break;
            case 9:
                pf.d.r((Context) obj, ((TL_stars.StarsTransaction) obj2).transaction_url);
                break;
            case 10:
                ci.h1 h1Var = (ci.h1) obj2;
                Context context2 = (Context) obj;
                if (h1Var != null) {
                    int i18 = h1Var.e;
                    if (i18 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.J1;
                        if (launchActivity != null) {
                            launchActivity.P0(i18);
                        }
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i18).getStoriesController().u(h1Var.c, h1Var.b);
                        if (u10 == null) {
                            u10 = h1Var.a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().A(i18, context2, u10, null);
                            AndroidUtilities.runOnUIThread(new ah.j(7), 200L);
                            break;
                        }
                    }
                }
                break;
            case 11:
                ci.p4 p4Var = (ci.p4) obj2;
                ci.m8 m8Var = (ci.m8) obj;
                ci.z9 z9Var = p4Var.J0;
                if (m8Var.b == null) {
                    org.telegram.ui.Components.qc Q = new org.telegram.ui.Components.xc(p4Var.c1, p4Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    if (m8Var.b.longValue() >= 0) {
                        bundle.putLong("user_id", m8Var.b.longValue());
                    } else {
                        bundle.putLong("chat_id", -m8Var.b.longValue());
                    }
                    if (m8Var.e && (num = m8Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        z9Var.H(new sn(bundle));
                        break;
                    } else {
                        z9Var.H(new ProfileActivity(bundle, null));
                        break;
                    }
                }
                break;
            case 12:
                ci.p4 p4Var2 = (ci.p4) obj2;
                ((ci.q9) p4Var2.Q1).h(new sg.y0(p4Var2.J0.f, 14, false));
                ((org.telegram.ui.ActionBar.h3) obj).dismiss();
                break;
            case 13:
                ci.p4 p4Var3 = ((ci.g4) obj2).l;
                aw alert = ((ci.u8) obj).getAlert();
                if (alert != null && (i4Var = p4Var3.Q1) != null) {
                    ((ci.q9) i4Var).h(alert);
                    p4Var3.t1.a();
                    break;
                }
                break;
            case 14:
                ei.q3 q3Var = (ei.q3) obj2;
                q3Var.e((MediaController.AlbumEntry) obj, false);
                q3Var.F.n();
                break;
            case 15:
                ei.j8 j8Var = (ei.j8) obj2;
                ei.p6 p6Var = (ei.p6) obj;
                org.telegram.ui.Cells.h3 h3Var2 = j8Var.Y;
                try {
                    charSequence = ((ClipboardManager) j8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(j8Var.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (charSequence != null) {
                    h3Var2.d.setText(charSequence.toString());
                    org.telegram.ui.Cells.f3 f3Var = h3Var2.d;
                    f3Var.setSelection(0, f3Var.getText().length());
                }
                p6Var.run();
                break;
            case 16:
                ei.vb vbVar = (ei.vb) obj2;
                new ei.t8((Context) obj, vbVar.c, true, vbVar.x0, new ei.u9(vbVar, 20), vbVar.a).show();
                break;
            case 17:
                gi.l.y0((gi.l) obj2, (Context) obj);
                break;
            case 18:
                gi.d3 d3Var = (gi.d3) obj2;
                gi.i0 i0Var = (gi.i0) obj;
                if (i0Var.c()) {
                    i0Var.a();
                } else {
                    File file = i0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = i0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.J1, null, true);
                    }
                }
                j80 j80Var = d3Var.O0;
                if (j80Var != null) {
                    j80Var.u();
                    d3Var.O0 = null;
                    break;
                }
                break;
            case 19:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.h3) obj2).dismiss();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.o4(connectedbotstarref.bot_id));
                    break;
                }
                break;
            case 20:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) obj2).link);
                org.telegram.ui.Components.xc.a0((sn) obj).k(false).j();
                break;
            case 21:
                ig.j0.Q((ig.j0) obj2, (TL_account.TL_connectedBot) obj);
                break;
            case 22:
                ji.b bVar = (ji.b) obj2;
                bVar.getClass();
                ((Runnable) obj).run();
                bVar.dismiss();
                break;
            case 23:
                ki.d2.Y((ki.d2) obj2, (Context) obj, view);
                break;
            case 24:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                break;
            case 25:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                break;
            case 26:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) obj;
                int indexOf = u0Var.g0.indexOf(t0Var.getFilter());
                if (u0Var.h0 == indexOf) {
                    if (t0Var.getFilter().h) {
                        if (!t0Var.a.f) {
                            t0Var.setSelectedForDelete(true);
                            break;
                        } else {
                            hg.o0 filter = t0Var.getFilter();
                            u0Var.C(filter);
                            org.telegram.ui.ActionBar.k5 k5Var = u0Var.H;
                            if (k5Var != null) {
                                k5Var.o(filter);
                                u0Var.H.q(u0Var.e);
                                break;
                            }
                        }
                    }
                } else {
                    u0Var.h0 = indexOf;
                    u0Var.y();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ActionBar.s0 s0Var = (org.telegram.ui.ActionBar.s0) obj2;
                org.telegram.ui.ActionBar.u0 u0Var2 = (org.telegram.ui.ActionBar.u0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var2.d;
                if (m1Var != null && m1Var.isShowing() && s0Var.f) {
                    if (!u0Var2.T) {
                        u0Var2.T = true;
                        u0Var2.d.d(u0Var2.R);
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var2.c;
                if (yVar == null) {
                    org.telegram.ui.ActionBar.q0 q0Var = u0Var2.P;
                    if (q0Var != null) {
                        q0Var.h(((Integer) view.getTag()).intValue());
                        break;
                    }
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                }
                break;
            case 28:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.v1) obj).a) {
                    org.telegram.ui.ActionBar.z1 z1Var = c2Var.o0;
                    if (z1Var != null) {
                        z1Var.g(c2Var, -1);
                    }
                    if (c2Var.j0) {
                        c2Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.v1) obj).a) {
                    org.telegram.ui.ActionBar.z1 z1Var2 = c2Var2.q0;
                    if (z1Var2 != null) {
                        z1Var2.g(c2Var2, -2);
                    }
                    if (c2Var2.j0) {
                        c2Var2.cancel();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ p(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.a = 9;
        this.b = context;
        this.c = starsTransaction;
    }
}
