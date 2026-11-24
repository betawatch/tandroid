// default package

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class n06 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n06(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(View view) {
        boolean z;
        tv8 tv8Var = (tv8) this.b;
        nv4 nv4Var = (nv4) this.c;
        if (tv8Var.K.getTag() == null) {
            int max = (int) Math.max(1.0f, tv8Var.getValue());
            pc6 pc6Var = (pc6) nv4Var.b;
            TLRPC.User user = (TLRPC.User) nv4Var.c;
            if (pc6Var.getLocationController().h(pc6Var.m0) == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pc6Var.getParentActivity());
                String M0 = jb6.M0(2131745187, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131745188, null);
                alertDialog$Builder.j(jb6.M0(2131745189, null), new yg((Object) pc6Var, (Object) user, max, (byte) 8));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                pc6Var.showDialog(heVar);
                z = false;
            } else {
                pc6Var.O.M = true;
                pc6Var.c.setImageResource(R.drawable.msg_location_alert2);
                pc6Var.r0().k(0L, 24, Integer.valueOf(max), user, null, null);
                pc6Var.getLocationController().o(max, pc6Var.m0, true);
                z = true;
            }
            if (z) {
                tv8Var.a();
            }
        }
    }

    private final void b(View view) {
        String str;
        gw8 gw8Var = (gw8) this.b;
        Context context = (Context) this.c;
        StringBuilder sb = new StringBuilder();
        String obj = gw8Var.a[0].getText().toString();
        String obj2 = gw8Var.a[3].getText().toString();
        String obj3 = gw8Var.a[2].getText().toString();
        String obj4 = gw8Var.a[1].getText().toString();
        String obj5 = gw8Var.a[4].getText().toString();
        try {
            if (gw8Var.w == 3) {
                i66 a = bw8.a();
                a.o(gw8Var.w);
                if (obj == null) {
                    obj = "";
                }
                a.c = obj;
                if (obj5 == null) {
                    obj5 = "";
                }
                a.f = obj5;
                gw8Var.b0(context, a.c().e());
                return;
            }
            if (!TextUtils.isEmpty(obj)) {
                sb.append("server=");
                sb.append(URLEncoder.encode(obj, "UTF-8"));
            }
            if (!TextUtils.isEmpty(obj4)) {
                if (sb.length() != 0) {
                    sb.append("&");
                }
                sb.append("port=");
                sb.append(URLEncoder.encode(obj4, "UTF-8"));
            }
            if (gw8Var.w == 2) {
                str = "https://t.me/proxy?";
                if (sb.length() != 0) {
                    sb.append("&");
                }
                sb.append("secret=");
                sb.append(URLEncoder.encode(obj5, "UTF-8"));
            } else {
                str = "https://t.me/socks?";
                if (!TextUtils.isEmpty(obj3)) {
                    if (sb.length() != 0) {
                        sb.append("&");
                    }
                    sb.append("user=");
                    sb.append(URLEncoder.encode(obj3, "UTF-8"));
                }
                if (!TextUtils.isEmpty(obj2)) {
                    if (sb.length() != 0) {
                        sb.append("&");
                    }
                    sb.append("pass=");
                    sb.append(URLEncoder.encode(obj2, "UTF-8"));
                }
            }
            if (sb.length() != 0) {
                gw8Var.b0(context, str.concat(sb.toString()));
            }
        } catch (Exception unused) {
        }
    }

    private final void c(View view) {
        ax8 ax8Var = (ax8) this.b;
        Context context = (Context) this.c;
        Uri B0 = gm.B0(ax8Var.l1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
        if (B0 != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", B0);
            try {
                gm.W(context).startActivityForResult(Intent.createChooser(intent, ax8Var.m0.getText()), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [int] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v12, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        char c;
        String a0;
        int i;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i2;
        int i3;
        Integer num;
        w48 w48Var;
        byte b = 18;
        byte b2 = 14;
        byte b3 = 2;
        boolean z = false;
        boolean z2 = false;
        byte b4 = 1;
        switch (this.a) {
            case 0:
                hb6[] hb6VarArr = (hb6[]) this.b;
                xy5[] xy5VarArr = (xy5[]) this.c;
                String str = LaunchActivity.C1;
                Integer num2 = (Integer) view.getTag();
                hb6VarArr[0] = ((xy5) view).getCurrentLocale();
                int i4 = 0;
                while (i4 < 2) {
                    xy5VarArr[i4].a.a(i4 == num2.intValue(), true);
                    i4++;
                }
                break;
            case 1:
                i46 i46Var = (i46) this.b;
                Context context = (Context) this.c;
                d dVar = i46Var.F2;
                int i5 = i46Var.c2;
                if (i5 != 11 && i5 != 34) {
                    byte b5 = 24;
                    if (i5 != 19 && i5 != 32 && !i46Var.j1()) {
                        if (i5 != 18 && i5 != 20 && i5 != 24 && i5 != 25 && i5 != 26 && i5 != 29 && i5 != 22 && i5 != 23 && i5 != 21 && i5 != 27 && i5 != 28 && i5 != 30 && i5 != 35) {
                            if (!z8c.h(i46Var.a).p() && !oc7.r1(i46Var.a).H3() && !i46Var.I2) {
                                if (dVar != null) {
                                    if (dVar.getVisibleDialog() != null) {
                                        dVar.getVisibleDialog().dismiss();
                                    }
                                    dVar.presentFragment(new PremiumPreviewFragment(0, i46.l1(i5)));
                                    i46Var.dismiss();
                                    break;
                                }
                            } else {
                                i46Var.dismiss();
                                break;
                            }
                        } else {
                            gm.g(i46Var.b1());
                            i46Var.dismiss();
                            break;
                        }
                    } else {
                        vh1 vh1Var = i46Var.X1;
                        if (vh1Var.b) {
                            if (!z8c.h(i46Var.a).p() || !oo0.k()) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i46Var.J0, context);
                                alertDialog$Builder.a.S = jb6.M0(2131746767, null);
                                alertDialog$Builder.a.U = gm.S2(jb6.M0(i46Var.i1() ? 2131746765 : 2131746766, null));
                                byte b6 = 0;
                                alertDialog$Builder.j(jb6.M0(2131752089, null), new t36(i46Var, b6));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), new u36(b6));
                                alertDialog$Builder.o();
                                break;
                            } else {
                                yn0.i(i46Var.V1, i46Var);
                                break;
                            }
                        } else if (vh1Var.a) {
                            if (vh1Var.c == 0) {
                                if (!vh1Var.e || !oo0.k()) {
                                    i46Var.Z0();
                                    break;
                                } else {
                                    i46Var.a2 = true;
                                    i46Var.s2.e0 = false;
                                    d dVar2 = i46Var.r1;
                                    vh1 vh1Var2 = i46Var.X1;
                                    y39 y39Var = new y39(dVar2, vh1Var2.h, vh1Var2.k);
                                    y39Var.show();
                                    y39Var.I0 = new n1(i46Var, b5);
                                    break;
                                }
                            } else {
                                ?? frameLayout = new FrameLayout(i46Var.getContext());
                                bf0 bf0Var = new bf0(i46Var.getContext());
                                bf0Var.setRoundRadius(gm.L(30.0f));
                                frameLayout.addView(bf0Var, qoe.c(60.0f, 60));
                                frameLayout.setClipChildren(false);
                                Paint paint = new Paint(1);
                                paint.setColor(cmb.w0(null, cmb.g5, false));
                                frameLayout.addView(new a91(i46Var.getContext(), paint, i46Var.getContext().getDrawable(R.drawable.filled_limit_boost)), qoe.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                                ImageView imageView = new ImageView(i46Var.getContext());
                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                anb.s(imageView, cmb.l6, null, PorterDuff.Mode.SRC_ATOP);
                                frameLayout.addView(imageView, qoe.e(24, 24, 17));
                                bf0 bf0Var2 = new bf0(i46Var.getContext());
                                bf0Var2.setRoundRadius(gm.L(30.0f));
                                frameLayout.addView(bf0Var2, qoe.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                                ?? frameLayout2 = new FrameLayout(i46Var.getContext());
                                frameLayout2.addView(frameLayout, qoe.e(-2, 60, 1));
                                frameLayout2.setClipChildren(false);
                                TextView textView = new TextView(context);
                                textView.setLetterSpacing(0.025f);
                                anb.X(textView, cmb.i5, null);
                                textView.setTextSize(1, 16.0f);
                                frameLayout2.addView(textView, qoe.t(-1, -2, 0, 24, 80, 24, 0));
                                pc0 pc0Var = new pc0((ylb) null);
                                TLRPC.Chat L0 = oc7.r1(i46Var.a).L0(Long.valueOf(-i46Var.X1.c));
                                pc0Var.p(L0);
                                bf0Var.f(L0, pc0Var);
                                pc0 pc0Var2 = new pc0((ylb) null);
                                TLRPC.Chat L02 = oc7.r1(i46Var.a).L0(Long.valueOf(-i46Var.V1));
                                pc0Var2.p(L02);
                                bf0Var2.f(L02, pc0Var2);
                                ?? alertDialog$Builder2 = new AlertDialog$Builder(context);
                                alertDialog$Builder2.n(frameLayout2);
                                hg9.q("ReplaceBoostChannelDescription", null, 2131746003, new Object[]{L0.title, L02.title}, textView);
                                alertDialog$Builder2.j(jb6.M0(2131746005, null), new t36(i46Var, b4));
                                alertDialog$Builder2.g(jb6.M0(2131752542, null), new u36(b4));
                                alertDialog$Builder2.o();
                                break;
                            }
                        } else {
                            int i6 = vh1Var.f;
                            if (i6 != 0) {
                                yn0.g(i6);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                ik.x((Context) this.c, jb6.M0(2131750814, null), jb6.M0(2131745244, null), -1L, new i56((s56) this.b, (byte) 0));
                break;
            case 3:
                s56 s56Var = (s56) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (s56Var.e == null) {
                    p56 p56Var = s56Var.f;
                    if (p56Var.e.h) {
                        int i7 = -s56Var.N;
                        s56Var.N = i7;
                        gm.A3(i7, p56Var, null);
                        break;
                    } else {
                        bjb bjbVar = (bjb) view;
                        Switch r3 = bjbVar.e;
                        bjbVar.setChecked(!r3.h);
                        s56Var.r.setVisibility(r3.h ? 0 : 8);
                        gm.r(runnableArr[0]);
                        boolean z3 = r3.h;
                        p56 p56Var2 = s56Var.f;
                        if (z3) {
                            p56Var2.setChecked(false);
                            s56Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            s56Var.h.setText(jb6.M0(2131754166, null));
                            l56 l56Var = new l56(s56Var, b4);
                            runnableArr[0] = l56Var;
                            gm.d3(l56Var, 60L);
                            break;
                        } else {
                            p56Var2.setCheckBoxIcon(0);
                            s56Var.h.setText(jb6.M0(2131754167, null));
                            l56 l56Var2 = new l56(s56Var, b3);
                            runnableArr[0] = l56Var2;
                            gm.c3(l56Var2);
                            break;
                        }
                    }
                }
                break;
            case 4:
                pc6 pc6Var = (pc6) this.b;
                pc6Var.B0((kc6) this.c);
                jc6 jc6Var = pc6Var.P0;
                if (jc6Var != null) {
                    jc6Var.dismiss();
                    break;
                }
                break;
            case 5:
                ze6 ze6Var = (ze6) this.b;
                Context context2 = (Context) this.c;
                String string = ze6Var.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    wkb wkbVar = new wkb();
                    wkbVar.a |= 256;
                    wkbVar.b = indexOf;
                    int i8 = lastIndexOf + 1;
                    wkbVar.c = i8;
                    spannableStringBuilder.setSpan(new xkb(wkbVar, 0), indexOf, i8, 0);
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.S = jb6.M0(2131748485, null);
                SpannableStringBuilder S2 = gm.S2(jb6.M0(2131748489, null));
                int i9 = ze6Var.H;
                int i10 = i9 / 86400;
                int i11 = i9 % 86400;
                int i12 = i11 / 3600;
                int i13 = (i11 % 3600) / 60;
                if (i10 == 0 && i12 == 0) {
                    i13 = Math.max(1, i13);
                }
                if (i10 == 0 || i12 == 0) {
                    c = 0;
                    a0 = (i12 == 0 || i13 == 0) ? i10 != 0 ? jb6.a0(null, null, 2131748491, jb6.G(i10, "Days", new Object[0])) : i12 != 0 ? jb6.a0(null, null, 2131748491, jb6.G(i10, "Hours", new Object[0])) : jb6.a0(null, null, 2131748491, jb6.G(i13, "Minutes", new Object[0])) : jb6.a0(null, null, 2131748492, jb6.G(i12, "Hours", new Object[0]), jb6.G(i13, "Minutes", new Object[0]));
                } else {
                    c = 0;
                    a0 = jb6.a0(null, null, 2131748492, jb6.G(i10, "Days", new Object[0]), jb6.G(i12, "Hours", new Object[0]));
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c] = spannableStringBuilder;
                charSequenceArr[1] = a0;
                alertDialog$Builder3.a.U = gm.m0(S2, charSequenceArr);
                alertDialog$Builder3.j(jb6.M0(2131748493, null), new wx4((Object) ze6Var, (byte) 27));
                alertDialog$Builder3.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder3.o();
                break;
            case 6:
                if6 if6Var = (if6) this.b;
                Context context3 = (Context) this.c;
                mh6 mh6Var = if6Var.E;
                if (mh6Var.W.getTag() == null) {
                    if (if6Var.n.has_recovery) {
                        mh6Var.B1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i = ((d) mh6Var).currentAccount;
                        ConnectionsManager.getInstance(i).sendRequest(tL_auth_requestPasswordRecovery, new gf6(if6Var, b4), 10);
                        break;
                    } else {
                        gm.t1(if6Var.a);
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context3);
                        alertDialog$Builder4.a.S = jb6.M0(2131745804, null);
                        alertDialog$Builder4.a.U = jb6.M0(2131745806, null);
                        alertDialog$Builder4.j(jb6.M0(2131751978, null), null);
                        alertDialog$Builder4.g(jb6.M0(2131745850, null), new wx4((Object) if6Var, (byte) 28));
                        alertDialog$Builder4.o();
                        break;
                    }
                }
                break;
            case 7:
                rg6 rg6Var = (rg6) this.b;
                Context context4 = (Context) this.c;
                Bundle bundle = rg6Var.r0;
                if (bundle != null && (tL_auth_sentCode = rg6Var.s0) != null) {
                    rg6Var.v0.q1(bundle, tL_auth_sentCode, true);
                    break;
                } else if (!rg6Var.g0) {
                    ng6 ng6Var = rg6Var.w;
                    if ((ng6Var == null || ng6Var.getVisibility() == 8) && !rg6Var.l0) {
                        if (rg6Var.j0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = rg6Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = rg6Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) a.b.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                            rg6Var.v0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(context4);
                            alertDialog$Builder5.a.S = jb6.M0(2131745804, null);
                            alertDialog$Builder5.a.U = gm.S2(jb6.a0(null, null, 2131751382, rg6Var.b));
                            alertDialog$Builder5.h(jb6.M0(2131751383, null), new nv4(rg6Var, context4, (byte) 22));
                            alertDialog$Builder5.j(jb6.M0(2131751978, null), null);
                            alertDialog$Builder5.g(jb6.M0(2131751385, null), new fg6(rg6Var, b4));
                            alertDialog$Builder5.o();
                            break;
                        } else if (rg6Var.v0.W.getTag() == null) {
                            rg6Var.v();
                            break;
                        }
                    }
                }
                break;
            case 8:
                lh6 lh6Var = (lh6) this.b;
                Context context5 = (Context) this.c;
                Toast toast = lh6Var.R;
                if (toast != null) {
                    toast.cancel();
                    lh6Var.R = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i14 = lh6Var.P;
                if (i14 <= 0 || currentTimeMillis - lh6Var.Q <= 1500) {
                    i2 = 0;
                    i3 = i14;
                } else {
                    i2 = 0;
                    lh6Var.P = 0;
                    i3 = 0;
                }
                int i15 = i3 + 1;
                lh6Var.P = i15;
                lh6Var.Q = currentTimeMillis;
                if (i15 >= 5) {
                    lh6Var.P = i2;
                    lh6Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(lh6Var.getContext());
                    alertDialog$Builder6.a.S = jb6.M0(2131745220, null);
                    alertDialog$Builder6.e(new String[]{jb6.M0(e21.a ? 2131751576 : 2131751568, null), jb6.M0(2131751550, null)}, new r30(lh6Var, b3));
                    alertDialog$Builder6.o();
                    break;
                } else if (i15 > 1) {
                    Toast makeText = Toast.makeText(context5, jb6.G(5 - i15, "DebugMenuLoginToast", new Object[0]), 0);
                    lh6Var.R = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 9:
                r67 r67Var = (r67) this.b;
                k47 k47Var = (k47) this.c;
                t67 t67Var = r67Var.d;
                if (!t67Var.d0(k47Var)) {
                    t67Var.getOrCreateStoryViewer().J(t67Var.getParentActivity(), k47Var.l, q4b.a(t67Var.f));
                    break;
                }
                break;
            case 10:
                pr7 pr7Var = (pr7) this.b;
                h01 h01Var = (h01) this.c;
                if (!pr7Var.g2) {
                    h01Var.run();
                    break;
                }
                break;
            case 11:
                ms7 ms7Var = (ms7) this.b;
                qac qacVar = (qac) this.c;
                b61 b61Var = ms7Var.q1;
                if (b61Var.e0 && !b61Var.R) {
                    gm.t1(ms7Var.n1);
                    qacVar.a(Long.valueOf(ms7Var.s1));
                    break;
                }
                break;
            case 12:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? nm7.Z1 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                anb.s(passcodeActivity.s, atomicBoolean.get() ? cmb.k6 : cmb.G6, null, PorterDuff.Mode.SRC_ATOP);
                break;
            case 13:
                ((p) this.b).o0(view, (String) this.c);
                break;
            case 14:
                a58 a58Var = (a58) this.b;
                g5b g5bVar = (g5b) this.c;
                oab oabVar = a58Var.z0;
                if (g5bVar.b != null) {
                    Bundle bundle2 = new Bundle();
                    long longValue = g5bVar.b.longValue();
                    Long l = g5bVar.b;
                    if (longValue >= 0) {
                        bundle2.putLong("user_id", l.longValue());
                    } else {
                        bundle2.putLong("chat_id", -l.longValue());
                    }
                    if (!g5bVar.e || (num = g5bVar.d) == null) {
                        oabVar.L(new ProfileActivity(bundle2, null));
                        break;
                    } else {
                        bundle2.putInt("message_id", num.intValue());
                        oabVar.L(new yv1(bundle2));
                        break;
                    }
                } else {
                    u31 Q = new c41(a58Var.S0, a58Var.r0).Q(R.raw.error, 36, jb6.M0(2131744350, null));
                    Q.a = 3;
                    Q.k(true);
                    break;
                }
                break;
            case 15:
                a58 a58Var2 = (a58) this.b;
                my0 my0Var = (my0) this.c;
                ((fab) a58Var2.G1).h(new kj8(a58Var2.z0.f, 14, false));
                my0Var.dismiss();
                break;
            case 16:
                v48 v48Var = (v48) this.b;
                y5b y5bVar = (y5b) this.c;
                a58 a58Var3 = v48Var.x;
                az3 alert = y5bVar.getAlert();
                if (alert != null && (w48Var = a58Var3.G1) != null) {
                    ((fab) w48Var).h(alert);
                    a58Var3.j1.a();
                    break;
                }
                break;
            case 17:
                d68 d68Var = (d68) this.b;
                ylb ylbVar = (ylb) this.c;
                ArrayList arrayList = d68Var.F1;
                ArrayList arrayList2 = d68Var.G1;
                d dVar3 = d68Var.s1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = d68Var.H1;
                if (d68Var.D1) {
                    AlertDialog$Builder alertDialog$Builder7 = new AlertDialog$Builder(d68Var.getContext());
                    alertDialog$Builder7.a.S = jb6.M0(2131754441, null);
                    alertDialog$Builder7.g(jb6.M0(2131752542, null), null);
                    alertDialog$Builder7.e(new CharSequence[]{jb6.M0(2131751654, null), jb6.M0(2131754372, null)}, new z58(d68Var));
                    alertDialog$Builder7.o();
                    break;
                } else {
                    StringBuilder sb = !tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", bw2.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                    int lastIndexOf2 = sb.lastIndexOf("END:VCARD");
                    if (lastIndexOf2 >= 0) {
                        tL_userContact_old2.phone = null;
                        int size = arrayList2.size() - 1;
                        while (size >= 0) {
                            fm fmVar = (fm) arrayList2.get(size);
                            boolean z4 = fmVar.d;
                            ?? r15 = fmVar.a;
                            if (z4) {
                                if (tL_userContact_old2.phone == null) {
                                    tL_userContact_old2.phone = fmVar.c(z);
                                }
                                for (?? r13 = z; r13 < r15.size(); r13++) {
                                    sb.insert(lastIndexOf2, ((String) r15.get(r13)) + "\n");
                                }
                            }
                            size--;
                            z = false;
                        }
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            fm fmVar2 = (fm) arrayList.get(size2);
                            boolean z5 = fmVar2.d;
                            ArrayList arrayList3 = fmVar2.a;
                            if (z5) {
                                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3 += -1) {
                                    sb.insert(lastIndexOf2, ((String) arrayList3.get(size3)) + "\n");
                                }
                            }
                        }
                        tL_userContact_old2.restriction_reason.clear();
                        TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                        restrictionReason.text = sb.toString();
                        restrictionReason.reason = "";
                        restrictionReason.platform = "";
                        tL_userContact_old2.restriction_reason.add(restrictionReason);
                    }
                    boolean z6 = dVar3 instanceof yv1;
                    if (z6) {
                        yv1 yv1Var = (yv1) dVar3;
                        if (yv1Var.X7()) {
                            ik.J(d68Var.getContext(), yv1Var.a(), new t58(d68Var), ylbVar);
                            break;
                        }
                    }
                    ik.X(d68Var.a, z6 ? ((yv1) dVar3).a() : 0L, 1, new ci7(d68Var, (byte) 13));
                    break;
                }
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                bu5 bu5Var = (bu5) this.c;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (photoViewer.S4 != null) {
                    bu5Var.u();
                    d dVar4 = photoViewer.l4;
                    if (dVar4 instanceof yv1) {
                        ((yv1) dVar4).Y9(photoViewer.S4, false, true);
                    }
                    l11.t(photoViewer.F, Uri.parse(photoViewer.S4.T0), true, false, false, null, null, false, oc7.r1(photoViewer.U).l4.A2.f, false, false);
                    break;
                }
                break;
            case 19:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                if (!photoViewer2.K0() && !photoViewer2.r) {
                    int i16 = photoViewer2.O4;
                    if (i16 >= 0 && i16 < photoViewer2.f7.size()) {
                        Object obj = photoViewer2.f7.get(photoViewer2.O4);
                        if (obj instanceof jo6) {
                            jo6 jo6Var = (jo6) obj;
                            if (!jo6Var.b || jo6Var.d()) {
                                jo6Var.z = Boolean.valueOf(!jo6Var.c());
                                photoViewer2.k1.setPhotoState(jo6Var.c());
                                boolean c2 = jo6Var.c();
                                hg5 hg5Var = photoViewer2.l1;
                                if (hg5Var != null) {
                                    hg5Var.f(true);
                                    photoViewer2.l1 = null;
                                }
                                if (photoViewer2.F != null) {
                                    photoViewer2.l1 = new hg5(photoViewer2.F, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) jb6.M0(c2 ? 2131746994 : 2131746993, null));
                                    append.setSpan(new pn2(c2 ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.l1.t(append);
                                    photoViewer2.f0.addView(photoViewer2.l1, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.l1.setTranslationY(photoViewer2.Q0.getTranslationY());
                                    photoViewer2.l1.o(0.0f, (photoViewer2.k1.getWidth() / 2.0f) + photoViewer2.k1.getX() + photoViewer2.I0.getX());
                                    hg5 hg5Var2 = photoViewer2.l1;
                                    hg5Var2.r0 = new hi(hg5Var2, (byte) 6);
                                    hg5Var2.d = 3500L;
                                    hg5Var2.v();
                                }
                                gda.d1 = jo6Var.c();
                                a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", gda.d1).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.k1.getTag() == null) {
                        if (photoViewer2.p8) {
                            kvb kvbVar = photoViewer2.n1;
                            if (kvbVar == null) {
                                lb8 lb8Var = photoViewer2.f0;
                                kvbVar = new kvb(activity);
                                kvbVar.d = new zcb(kvbVar, b);
                                kvbVar.setBackgroundDrawable(cmb.b0(gm.L(3.0f), -871296751));
                                kvbVar.setTextColor(-1);
                                kvbVar.setTextSize(1, 14.0f);
                                kvbVar.setPadding(gm.L(8.0f), gm.L(7.0f), gm.L(8.0f), gm.L(7.0f));
                                kvbVar.setGravity(16);
                                lb8Var.addView(kvbVar, qoe.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                kvbVar.setVisibility(8);
                                photoViewer2.n1 = kvbVar;
                            }
                            kvbVar.setText(jb6.M0(2131743270, "VideoQualityIsTooLow"));
                            kvb kvbVar2 = photoViewer2.n1;
                            kcc kccVar = photoViewer2.k1;
                            zcb zcbVar = kvbVar2.d;
                            if (kccVar != null) {
                                kvbVar2.a = kccVar;
                                kvbVar2.a();
                                kvbVar2.c = true;
                                gm.r(zcbVar);
                                gm.d3(zcbVar, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = kvbVar2.b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    kvbVar2.b.cancel();
                                    kvbVar2.b = null;
                                }
                                if (kvbVar2.getVisibility() != 0) {
                                    kvbVar2.setAlpha(0.0f);
                                    kvbVar2.setVisibility(0);
                                    ViewPropertyAnimator listener = kvbVar2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    kvbVar2.b = listener;
                                    listener.start();
                                    break;
                                }
                            }
                        }
                    } else {
                        photoViewer2.h2(true);
                        photoViewer2.x1(1);
                        break;
                    }
                }
                break;
            case 20:
                v72.g0((yv1) this.c, 41026, new ci7((lf8) this.b, b2), null);
                break;
            case 21:
                ((bu5) this.b).L((bu5) this.c);
                break;
            case 22:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                AlertDialog$Builder alertDialog$Builder8 = (AlertDialog$Builder) this.c;
                privacySettingsActivity.getClass();
                alertDialog$Builder8.a.M0.run();
                Integer num3 = (Integer) view.getTag();
                int i17 = num3.intValue() == 0 ? 30 : num3.intValue() == 1 ? 90 : num3.intValue() == 2 ? nm7.L2 : num3.intValue() == 3 ? 365 : num3.intValue() == 4 ? 548 : num3.intValue() == 5 ? 730 : 0;
                he heVar = new he(3, null, privacySettingsActivity.getParentActivity());
                heVar.j0 = false;
                heVar.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i17;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new fm8((Object) privacySettingsActivity, (Object) heVar, (Object) setaccountttl, (byte) (z2 ? 1 : 0)));
                break;
            case 23:
                om8 om8Var = (om8) this.b;
                p09 p09Var = (p09) this.c;
                boolean z7 = om8Var.w;
                om8Var.w = !z7;
                if (z7) {
                    p09Var.H(69);
                    p09Var.K(99);
                } else {
                    p09Var.H(36);
                    p09Var.K(69);
                }
                p09Var.start();
                break;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF = ProfileActivity.e7;
                u31.e();
                l11.u(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 25:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF2 = ProfileActivity.e7;
                long j = profileActivity2.e1;
                long j2 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                ke2 ke2Var = new ke2(j, j2, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                ke2Var.Y0 = new wo8(profileActivity2, chat, ke2Var);
                profileActivity2.presentFragment(ke2Var);
                break;
            case 26:
                a(view);
                break;
            case 27:
                b(view);
                break;
            case 28:
                c(view);
                break;
            default:
                String str2 = (String) this.b;
                Context context6 = (Context) this.c;
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", str2);
                Intent createChooser = Intent.createChooser(intent, jb6.M0(2131745192, null));
                createChooser.setFlags(TLObject.FLAG_28);
                context6.startActivity(createChooser);
                break;
        }
    }
}
