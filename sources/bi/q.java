package bi;

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
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        di.j4 j4Var;
        int i10 = this.a;
        s1 s1Var = null;
        CharSequence charSequence = null;
        s1Var = null;
        int i11 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                y.Y((y) obj2, (Context) obj, view);
                break;
            case 1:
                b1 b1Var = (b1) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = b1.x0;
                    if (i12 >= 6) {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        ai.i iVar = new ai.i(b1Var, 4);
                        Pattern pattern = org.telegram.ui.Components.g5.a;
                        jg.g2 b10 = jg.g2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.j5, false);
                            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ji, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ni, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E8, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G8, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i6, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
                            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context, (org.telegram.ui.ActionBar.u6) null, false);
                            k3Var.fixNavigationBar();
                            k3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            nd0 nd0Var = new nd0(context, null);
                            nd0Var.setAllItemsCount(6);
                            nd0Var.setItemCount(Math.min(6, 8));
                            nd0Var.setTextColor(x02);
                            nd0Var.setGravity(17);
                            nd0Var.setMinValue(0);
                            nd0Var.setMaxValue(5);
                            nd0Var.setValue(i13);
                            linearLayout.addView(nd0Var, kb1.p(1.0f, 0, 432));
                            nd0Var.setFormatter(new org.telegram.ui.Components.s(strArr, 7));
                            org.telegram.ui.Components.x4 x4Var = new org.telegram.ui.Components.x4(context, nd0Var);
                            x4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(x02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new ei.d(10));
                            x4Var.addView(frameLayout, kb1.x(-1, -2, 51, 22, 0, 0, 4));
                            x4Var.addView(linearLayout, kb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            fi.d dVar = new fi.d(context, null, true);
                            dVar.i(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.n2(r2, i11));
                            x4Var.addView(dVar, kb1.x(-1, 48, 0, 16, 12, 16, 12));
                            k3Var.customView = x4Var;
                            k3Var.show();
                            k3Var.setOnDismissListener(new u3(9, iVar, nd0Var));
                            k3Var.setBackgroundColor(x03);
                            k3Var.fixNavigationBar(x03);
                            org.telegram.ui.ActionBar.k3[] k3VarArr = {k3Var};
                            break;
                        }
                    } else {
                        strArr[i12] = LocaleController.formatPluralString("GiftOfferHours", iArr[i12] / 3600, new Object[0]);
                        if (iArr[i12] == b1Var.o0) {
                            i13 = i12;
                        }
                        i12++;
                    }
                }
                break;
            case 2:
                k1 k1Var = (k1) obj2;
                ai.n1 n1Var = (ai.n1) obj;
                fi.d dVar2 = k1Var.f;
                if (dVar2.c0 && !dVar2.Q) {
                    AndroidUtilities.hideKeyboard(k1Var.c);
                    dVar2.setLoading(true);
                    n1Var.run(k1Var.E);
                    break;
                }
                break;
            case 3:
                x1 x1Var = (x1) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList = (ArrayList) obj;
                p1 p1Var = x1Var.o0;
                int i14 = x1Var.z0;
                if (i14 != 2) {
                    if (i14 == 1) {
                        s1 s1Var2 = new s1(p1Var.getUpgradeBackdropAttribute(), p1Var.getUpgradePatternAttribute(), p1Var.getUpgradeImageViewAttribute());
                        x1Var.t0 = s1Var2;
                        p1Var.setPreviewAttributes(s1Var2);
                        x1Var.T(2);
                        break;
                    }
                } else {
                    p1Var.setPreviewingAttributes(arrayList);
                    x1Var.T(1);
                    break;
                }
                break;
            case 4:
                s1 s1Var3 = (s1) obj;
                x1 x1Var2 = ((q1) obj2).P;
                int i15 = x1Var2.z0;
                p1 p1Var2 = x1Var2.o0;
                if (i15 == 1) {
                    x1Var2.t0 = new s1(p1Var2.getUpgradeBackdropAttribute(), p1Var2.getUpgradePatternAttribute(), p1Var2.getUpgradeImageViewAttribute());
                    x1Var2.T(2);
                }
                int i16 = x1Var2.j0.s;
                s1 s1Var4 = x1Var2.t0;
                if (s1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = s1Var4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = s1Var4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = s1Var4.b;
                    if (i16 == 1) {
                        s1Var = new s1(s1Var3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i16 == 2) {
                        s1Var = new s1(stargiftattributebackdrop, s1Var3.b, stargiftattributemodel);
                    } else if (i16 == 0) {
                        s1Var = new s1(stargiftattributebackdrop, stargiftattributepattern, s1Var3.c);
                    }
                }
                x1Var2.t0 = s1Var;
                p1Var2.setPreviewAttributes(s1Var);
                x1Var2.V();
                break;
            case 5:
                h7 h7Var = (h7) obj2;
                boolean z10 = !h7Var.x1;
                h7Var.x1 = z10;
                ((org.telegram.ui.Cells.y1) obj).c(z10, true);
                break;
            case 6:
                qf.d.t(((h7) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url);
                break;
            case 7:
                ((h7) obj2).Q2((CharSequence) obj);
                break;
            case 8:
                z5 z5Var = (z5) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                if (z5Var.E.getAlpha() >= 1.0f && !z5Var.h0 && !z5Var.j0 && z5Var.d0 != null) {
                    new x1(z5Var.getContext(), u6Var, z5Var.W, z5Var.c0, z5Var.d0, true).show();
                    break;
                }
                break;
            case 9:
                qf.d.r((Context) obj, ((TL_stars.StarsTransaction) obj2).transaction_url);
                break;
            case 10:
                di.h1 h1Var = (di.h1) obj2;
                Context context2 = (Context) obj;
                if (h1Var != null) {
                    int i17 = h1Var.e;
                    if (i17 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            launchActivity.P0(i17);
                        }
                    }
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.c, h1Var.b);
                        if (u10 == null) {
                            u10 = h1Var.a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().B(i17, context2, u10, null);
                            AndroidUtilities.runOnUIThread(new ag.c(9), 200L);
                            break;
                        }
                    }
                }
                break;
            case 11:
                di.q4 q4Var = (di.q4) obj2;
                di.k8 k8Var = (di.k8) obj;
                di.y9 y9Var = q4Var.y0;
                if (k8Var.b == null) {
                    org.telegram.ui.Components.qc R = new org.telegram.ui.Components.wc(q4Var.R0, q4Var.q0).R(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                    R.a = 3;
                    R.k(true);
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    if (k8Var.b.longValue() >= 0) {
                        bundle.putLong("user_id", k8Var.b.longValue());
                    } else {
                        bundle.putLong("chat_id", -k8Var.b.longValue());
                    }
                    if (k8Var.e && (num = k8Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        y9Var.I(new wn(bundle));
                        break;
                    } else {
                        y9Var.I(new ProfileActivity(bundle, null));
                        break;
                    }
                }
                break;
            case 12:
                di.q4 q4Var2 = (di.q4) obj2;
                ((di.p9) q4Var2.F1).h(new tg.y0(q4Var2.y0.f, 14, false));
                ((org.telegram.ui.ActionBar.k3) obj).dismiss();
                break;
            case 13:
                di.q4 q4Var3 = ((di.h4) obj2).l;
                aw alert = ((di.t8) obj).getAlert();
                if (alert != null && (j4Var = q4Var3.F1) != null) {
                    ((di.p9) j4Var).h(alert);
                    q4Var3.i1.a();
                    break;
                }
                break;
            case 14:
                fi.o3 o3Var = (fi.o3) obj2;
                o3Var.e((MediaController.AlbumEntry) obj, false);
                o3Var.F.o();
                break;
            case 15:
                fi.f8 f8Var = (fi.f8) obj2;
                e2.q0 q0Var = (e2.q0) obj;
                org.telegram.ui.Cells.g3 g3Var = f8Var.Y;
                try {
                    charSequence = ((ClipboardManager) f8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(f8Var.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (charSequence != null) {
                    g3Var.d.setText(charSequence.toString());
                    org.telegram.ui.Cells.e3 e3Var = g3Var.d;
                    e3Var.setSelection(0, e3Var.getText().length());
                }
                q0Var.run();
                break;
            case 16:
                fi.sb sbVar = (fi.sb) obj2;
                new fi.p8((Context) obj, sbVar.c, true, sbVar.x0, new fi.q9(sbVar, 20), sbVar.a).show();
                break;
            case 17:
                hi.k.w0((hi.k) obj2, (Context) obj);
                break;
            case 18:
                hi.m3 m3Var = (hi.m3) obj2;
                hi.p0 p0Var = (hi.p0) obj;
                if (p0Var.c()) {
                    p0Var.a();
                } else {
                    File file = p0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = p0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.I1, null, true);
                    }
                }
                l80 l80Var = m3Var.O0;
                if (l80Var != null) {
                    l80Var.u();
                    m3Var.O0 = null;
                    break;
                }
                break;
            case 19:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.k3) obj2).dismiss();
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.t4(connectedbotstarref.bot_id));
                    break;
                }
                break;
            case 20:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) obj2).link);
                org.telegram.ui.Components.wc.b0((wn) obj).k(false).j();
                break;
            case 21:
                jg.k0.Q((jg.k0) obj2, (TL_account.TL_connectedBot) obj);
                break;
            case 22:
                ki.b bVar = (ki.b) obj2;
                bVar.getClass();
                ((Runnable) obj).run();
                bVar.dismiss();
                break;
            case 23:
                li.b2.Y((li.b2) obj2, (Context) obj, view);
                break;
            case 24:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                break;
            case 25:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                break;
            case 26:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = w0Var.g0.indexOf(v0Var.getFilter());
                if (w0Var.h0 == indexOf) {
                    if (v0Var.getFilter().h) {
                        if (!v0Var.a.f) {
                            v0Var.setSelectedForDelete(true);
                            break;
                        } else {
                            ig.p0 filter = v0Var.getFilter();
                            w0Var.I(filter);
                            org.telegram.ui.ActionBar.s0 s0Var = w0Var.H;
                            if (s0Var != null) {
                                s0Var.j(filter);
                                w0Var.H.l(w0Var.e);
                                break;
                            }
                        }
                    }
                } else {
                    w0Var.h0 = indexOf;
                    w0Var.D();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.ActionBar.w0 w0Var2 = (org.telegram.ui.ActionBar.w0) obj;
                if (w0Var2.x() && u0Var.f) {
                    if (!w0Var2.T) {
                        w0Var2.T = true;
                        w0Var2.q();
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var2.c;
                if (zVar == null) {
                    org.telegram.ui.ActionBar.r0 r0Var = w0Var2.P;
                    if (r0Var != null) {
                        r0Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                } else {
                    zVar.n(((Integer) view.getTag()).intValue());
                    break;
                }
                break;
            case 28:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).a) {
                    org.telegram.ui.ActionBar.b2 b2Var = e2Var.o0;
                    if (b2Var != null) {
                        b2Var.h(e2Var, -1);
                    }
                    if (e2Var.j0) {
                        e2Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).a) {
                    org.telegram.ui.ActionBar.b2 b2Var2 = e2Var2.q0;
                    if (b2Var2 != null) {
                        b2Var2.h(e2Var2, -2);
                    }
                    if (e2Var2.j0) {
                        e2Var2.cancel();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ q(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.a = 9;
        this.b = context;
        this.c = starsTransaction;
    }
}
