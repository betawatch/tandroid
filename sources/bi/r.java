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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.we;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.qu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        di.c4 c4Var;
        int i7 = this.a;
        int i10 = 10;
        int i11 = 2;
        r1 r1Var = null;
        CharSequence charSequence = null;
        r1Var = null;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                z.c0((z) obj2, (Context) obj, view);
                break;
            case 1:
                a1 a1Var = (a1) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = a1.s2;
                    if (i12 >= 6) {
                        String M0 = org.telegram.messenger.id.M0(2131749730, null);
                        ai.i iVar = new ai.i(a1Var, 4);
                        Pattern pattern = org.telegram.ui.Components.u4.a;
                        kg.x1 b10 = kg.x1.b(p10.s0);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false);
                            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false);
                            org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.xj, false);
                            org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Bj, false);
                            org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E8, false);
                            org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G8, false);
                            org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i6, false);
                            org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gi, false);
                            org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false);
                            org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false);
                            org.telegram.ui.ActionBar.w2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
                            l10.v0 = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            hb0 hb0Var = new hb0(context, null);
                            hb0Var.setAllItemsCount(6);
                            hb0Var.setItemCount(Math.min(6, 8));
                            hb0Var.setTextColor(x02);
                            hb0Var.setGravity(17);
                            hb0Var.setMinValue(0);
                            hb0Var.setMaxValue(5);
                            hb0Var.setValue(i13);
                            linearLayout.addView(hb0Var, c8.ha.l(1.0f, 0, 432));
                            hb0Var.setFormatter(new org.telegram.ui.Components.t(strArr, 7));
                            org.telegram.ui.Components.e4 e4Var = new org.telegram.ui.Components.e4(context, hb0Var, i11);
                            e4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(M0);
                            textView.setTextColor(x02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(org.telegram.messenger.g0.o());
                            frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new ei.b(10));
                            e4Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                            e4Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            fi.d dVar = new fi.d(context, null, true);
                            dVar.i(org.telegram.messenger.id.M0(2131745672, null), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.h2(r3, 1));
                            e4Var.addView(dVar, c8.ha.t(-1, 48, 0, 16, 12, 16, 12));
                            l10.N = e4Var;
                            l10.show();
                            l10.setOnDismissListener(new u3(9, iVar, hb0Var));
                            l10.v0(x03);
                            l10.O(x03);
                            org.telegram.ui.ActionBar.w2[] w2VarArr = {l10};
                            break;
                        }
                    } else {
                        strArr[i12] = org.telegram.messenger.id.G(iArr[i12] / 3600, "GiftOfferHours", new Object[0]);
                        if (iArr[i12] == a1Var.j2) {
                            i13 = i12;
                        }
                        i12++;
                    }
                }
                break;
            case 2:
                h1 h1Var = (h1) obj2;
                ai.f1 f1Var = (ai.f1) obj;
                fi.d dVar2 = h1Var.p1;
                if (dVar2.c0 && !dVar2.Q) {
                    org.telegram.messenger.g0.v1(h1Var.m1);
                    dVar2.setLoading(true);
                    f1Var.a(h1Var.y1);
                    break;
                }
                break;
            case 3:
                w1 w1Var = (w1) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList = (ArrayList) obj;
                o1 o1Var = w1Var.j2;
                int i14 = w1Var.u2;
                if (i14 != 2) {
                    if (i14 == 1) {
                        r1 r1Var2 = new r1(o1Var.getUpgradeBackdropAttribute(), o1Var.getUpgradePatternAttribute(), o1Var.getUpgradeImageViewAttribute());
                        w1Var.o2 = r1Var2;
                        o1Var.setPreviewAttributes(r1Var2);
                        w1Var.g1(2);
                        break;
                    }
                } else {
                    o1Var.setPreviewingAttributes(arrayList);
                    w1Var.g1(1);
                    break;
                }
                break;
            case 4:
                r1 r1Var3 = (r1) obj;
                w1 w1Var2 = ((p1) obj2).P;
                int i15 = w1Var2.u2;
                o1 o1Var2 = w1Var2.j2;
                if (i15 == 1) {
                    w1Var2.o2 = new r1(o1Var2.getUpgradeBackdropAttribute(), o1Var2.getUpgradePatternAttribute(), o1Var2.getUpgradeImageViewAttribute());
                    w1Var2.g1(2);
                }
                int i16 = w1Var2.e2.s;
                r1 r1Var4 = w1Var2.o2;
                if (r1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = r1Var4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = r1Var4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = r1Var4.b;
                    if (i16 == 1) {
                        r1Var = new r1(r1Var3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i16 == 2) {
                        r1Var = new r1(stargiftattributebackdrop, r1Var3.b, stargiftattributemodel);
                    } else if (i16 == 0) {
                        r1Var = new r1(stargiftattributebackdrop, stargiftattributepattern, r1Var3.c);
                    }
                }
                w1Var2.o2 = r1Var;
                o1Var2.setPreviewAttributes(r1Var);
                w1Var2.i1();
                break;
            case 5:
                k7 k7Var = (k7) obj2;
                boolean z9 = !k7Var.s3;
                k7Var.s3 = z9;
                ((org.telegram.ui.Cells.c2) obj).c(z9, true);
                break;
            case 6:
                vf.c.v(((k7) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url, false);
                break;
            case 7:
                ((k7) obj2).o2((CharSequence) obj);
                break;
            case 8:
                d6 d6Var = (d6) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (d6Var.E.getAlpha() >= 1.0f && !d6Var.h0 && !d6Var.j0 && d6Var.d0 != null) {
                    new w1(d6Var.getContext(), h6Var, d6Var.W, d6Var.c0, d6Var.d0, true).show();
                    break;
                }
                break;
            case 9:
                vf.c.t((Context) obj, ((TL_stars.StarsTransaction) obj2).transaction_url);
                break;
            case 10:
                di.j4 j4Var = (di.j4) obj2;
                di.c8 c8Var = (di.c8) obj;
                di.q9 q9Var = j4Var.s0;
                if (c8Var.b == null) {
                    org.telegram.ui.Components.bc Q = new org.telegram.ui.Components.gc(j4Var.L0, j4Var.k0).Q(R.raw.error, 36, org.telegram.messenger.id.M0(2131744664, null));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    if (c8Var.b.longValue() >= 0) {
                        bundle.putLong("user_id", c8Var.b.longValue());
                    } else {
                        bundle.putLong("chat_id", -c8Var.b.longValue());
                    }
                    if (c8Var.e && (num = c8Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        q9Var.N(new cn(bundle));
                        break;
                    } else {
                        q9Var.N(new ProfileActivity(bundle, null));
                        break;
                    }
                }
                break;
            case 11:
                di.j4 j4Var2 = (di.j4) obj2;
                ((di.h9) j4Var2.z1).h(new ug.w0(j4Var2.s0.f, 14, false));
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
                break;
            case 12:
                di.j4 j4Var3 = ((di.a4) obj2).x;
                qu alert = ((di.l8) obj).getAlert();
                if (alert != null && (c4Var = j4Var3.z1) != null) {
                    ((di.h9) c4Var).h(alert);
                    j4Var3.c1.a();
                    break;
                }
                break;
            case 13:
                fi.f3 f3Var = (fi.f3) obj2;
                f3Var.e((we) obj, false);
                f3Var.F.o();
                break;
            case 14:
                fi.m7 m7Var = (fi.m7) obj2;
                f2.h hVar = (f2.h) obj;
                org.telegram.ui.Cells.k3 k3Var = m7Var.T1;
                try {
                    charSequence = ((ClipboardManager) m7Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(m7Var.getContext());
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (charSequence != null) {
                    k3Var.d.setText(charSequence.toString());
                    org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                    i3Var.setSelection(0, i3Var.getText().length());
                }
                hVar.run();
                break;
            case 15:
                fi.va vaVar = (fi.va) obj2;
                new fi.w7((Context) obj, vaVar.c, true, vaVar.x0, new fi.v8(vaVar, 20), vaVar.a).show();
                break;
            case 16:
                hi.j.A0((hi.j) obj2, (Context) obj);
                break;
            case 17:
                hi.a3 a3Var = (hi.a3) obj2;
                hi.f0 f0Var = (hi.f0) obj;
                if (f0Var.c()) {
                    f0Var.a();
                } else {
                    File file = f0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = f0Var.d;
                        org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                k60 k60Var = a3Var.O0;
                if (k60Var != null) {
                    k60Var.u();
                    a3Var.O0 = null;
                    break;
                }
                break;
            case 18:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.w2) obj2).dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.D4(connectedbotstarref.bot_id));
                    break;
                }
                break;
            case 19:
                org.telegram.messenger.g0.g(((TL_account.TL_businessChatLink) obj2).link);
                org.telegram.ui.Components.gc.a0((cn) obj).k(false).j();
                break;
            case 20:
                kg.i0 i0Var = (kg.i0) obj2;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj;
                kg.a0 a0Var = i0Var.U1;
                fi.d dVar3 = i0Var.Y1;
                if (!dVar3.Q) {
                    dVar3.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.bot = qp.s1(i0Var.a).o1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = a0Var.b();
                    ConnectionsManager.getInstance(i0Var.a).sendRequest(updateconnectedbot, new f2(i0Var, tL_connectedBot, a0Var.c(), i10));
                    break;
                }
                break;
            case 21:
                ki.b bVar = (ki.b) obj2;
                bVar.getClass();
                ((Runnable) obj).run();
                bVar.dismiss();
                break;
            case 22:
                li.b2.c0((li.b2) obj2, (Context) obj, view);
                break;
            case 23:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                break;
            case 24:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                break;
            case 25:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) obj2;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj;
                int indexOf = r0Var.g0.indexOf(q0Var.getFilter());
                if (r0Var.h0 == indexOf) {
                    if (q0Var.getFilter().h) {
                        if (!q0Var.a.f) {
                            q0Var.setSelectedForDelete(true);
                            break;
                        } else {
                            jg.o0 filter = q0Var.getFilter();
                            r0Var.I(filter);
                            org.telegram.ui.ActionBar.n0 n0Var = r0Var.H;
                            if (n0Var != null) {
                                n0Var.j(filter);
                                r0Var.H.l(r0Var.e);
                                break;
                            }
                        }
                    }
                } else {
                    r0Var.h0 = indexOf;
                    r0Var.D();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.ActionBar.p0 p0Var = (org.telegram.ui.ActionBar.p0) obj2;
                org.telegram.ui.ActionBar.r0 r0Var2 = (org.telegram.ui.ActionBar.r0) obj;
                if (r0Var2.x() && p0Var.f) {
                    if (!r0Var2.T) {
                        r0Var2.T = true;
                        r0Var2.q();
                    }
                }
                org.telegram.ui.ActionBar.y yVar = r0Var2.c;
                if (yVar == null) {
                    org.telegram.ui.ActionBar.m0 m0Var = r0Var2.P;
                    if (m0Var != null) {
                        m0Var.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                if (!((org.telegram.ui.ActionBar.n1) obj).a) {
                    org.telegram.ui.ActionBar.r1 r1Var5 = u1Var.m0;
                    if (r1Var5 != null) {
                        r1Var5.g(u1Var, -1);
                    }
                    if (u1Var.j0) {
                        u1Var.dismiss();
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) obj2;
                if (!((org.telegram.ui.ActionBar.n1) obj).a) {
                    org.telegram.ui.ActionBar.r1 r1Var6 = u1Var2.o0;
                    if (r1Var6 != null) {
                        r1Var6.g(u1Var2, -2);
                    }
                    if (u1Var2.j0) {
                        u1Var2.cancel();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.u1 u1Var3 = (org.telegram.ui.ActionBar.u1) obj2;
                if (!((org.telegram.ui.ActionBar.n1) obj).a) {
                    org.telegram.ui.ActionBar.r1 r1Var7 = u1Var3.s0;
                    if (r1Var7 != null) {
                        r1Var7.g(u1Var3, -2);
                    }
                    if (u1Var3.j0) {
                        u1Var3.dismiss();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ r(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.a = 9;
        this.b = context;
        this.c = starsTransaction;
    }
}
