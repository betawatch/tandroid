// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kf4 extends la {
    public final Context d;
    public final /* synthetic */ nf4 e;

    public kf4(nf4 nf4Var, Context context) {
        this.e = nf4Var;
        this.d = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return (i == 3 || i == 0 || i == 2 || i == 5 || i == 9 || i == 11) ? false : true;
    }

    @Override // j79
    public final int b() {
        return this.e.Q.size();
    }

    @Override // j79
    public final int d(int i) {
        ef4 ef4Var = (ef4) this.e.Q.get(i);
        if (ef4Var == null) {
            return 3;
        }
        return ef4Var.a;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        String M0;
        int i2;
        nf4 nf4Var = this.e;
        ArrayList arrayList = nf4Var.Q;
        ef4 ef4Var = (ef4) arrayList.get(i);
        if (ef4Var != null) {
            int i3 = i + 1;
            boolean z = false;
            boolean z2 = (i3 >= arrayList.size() || (i2 = ((ef4) arrayList.get(i3)).a) == 3 || i2 == 6) ? false : true;
            int i4 = f89Var.f;
            View view = f89Var.a;
            if (i4 == 0) {
                mf5 mf5Var = (mf5) view;
                boolean z3 = ef4Var.f;
                String str = ef4Var.d;
                if (z3) {
                    mf5Var.setText(nf4.E0(0, str, false));
                    return;
                } else {
                    mf5Var.setText(str);
                    return;
                }
            }
            if (i4 == 1) {
                vac vacVar = (vac) view;
                String str2 = ef4Var.i;
                if (str2 != null) {
                    vacVar.d(str2, ef4Var.d, null, z2);
                    return;
                }
                long j = ef4Var.h;
                if (j > 0) {
                    TLRPC.User X1 = nf4Var.getMessagesController().X1(Long.valueOf(j));
                    if (X1 != null) {
                        vacVar.d(X1, null, X1.bot ? ob6.M0(2131753149, null) : X1.contact ? ob6.M0(2131750757, null) : ob6.M0(2131750684, null), z2);
                        return;
                    }
                    return;
                }
                TLRPC.Chat M02 = nf4Var.getMessagesController().M0(Long.valueOf(-j));
                if (M02 != null) {
                    if (xc2.Y(M02)) {
                        M0 = ob6.M0(2131751955, null);
                    } else if (M02.participants_count != 0) {
                        boolean V = xc2.V(M02);
                        int i5 = M02.participants_count;
                        M0 = V ? ob6.H(',', "Subscribers", i5) : ob6.H(',', "Members", i5);
                    } else {
                        M0 = !xc2.t0(M02) ? (!xc2.T(M02) || M02.megagroup) ? ob6.M0(2131748395, null) : ob6.M0(2131752299, null) : (!xc2.T(M02) || M02.megagroup) ? ob6.M0(2131748392, null) : ob6.M0(2131752288, null);
                    }
                    vacVar.d(M02, null, M0, z2);
                    return;
                }
                return;
            }
            if (i4 != 4) {
                switch (i4) {
                    case 6:
                        ((ilb) view).setText(ef4Var.d);
                        break;
                    case 7:
                        ((hf4) view).e(ef4Var.m, z2);
                        break;
                    case 8:
                        we4 we4Var = (we4) view;
                        if (we4Var.c != z2) {
                            we4Var.c = z2;
                            we4Var.setWillNotDraw(!z2);
                            break;
                        }
                        break;
                    case 9:
                        cf4 cf4Var = (cf4) view;
                        nf4Var.J = cf4Var;
                        cf4Var.e(hm.cloneSpans(nf4Var.x, -1, cf4Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                        nf4Var.J.d(nf4Var.getUserConfig().p() ? nf4Var.F : -1, false);
                        nf4Var.J.setText(ob6.M0(2131750582, null));
                        break;
                    case 10:
                        d48 d48Var = (d48) view;
                        d48Var.setCloseAsLock(!nf4Var.getUserConfig().p());
                        d48Var.a(nf4Var.getUserConfig().p() ? nf4Var.F : -1, false);
                        d48Var.setOnColorClick(new rx1(this, d48Var, (byte) 21));
                        break;
                    case 11:
                        df4 df4Var = (df4) view;
                        nf4Var.K = df4Var;
                        df4Var.setText(ef4Var.d);
                        si siVar = df4Var.r;
                        siVar.setText(ef4Var.e);
                        siVar.setOnClickListener(ef4Var.c);
                        break;
                }
                return;
            }
            ue4 ue4Var = (ue4) view;
            boolean z4 = ef4Var.l;
            ImageView imageView = ue4Var.a;
            TextView textView = ue4Var.b;
            yob.s(imageView, z4 ? aob.q7 : aob.o6, null, PorterDuff.Mode.MULTIPLY);
            yob.X(textView, z4 ? aob.p7 : aob.q6, null);
            int i6 = ef4Var.k;
            String str3 = ef4Var.d;
            ImageView imageView2 = ue4Var.a;
            int i7 = ob6.a0 ? -1 : 1;
            if (i6 == 0) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                imageView2.setImageResource(i6);
            }
            if (ob6.a0) {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = hl.L(i6 == 0 ? 24.0f : 72.0f);
            } else {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = hl.L(i6 == 0 ? 24.0f : 72.0f);
            }
            textView.setText(str3);
            if (!z2 && i6 != 0) {
                z = true;
            }
            Boolean bool = ue4Var.e;
            if (bool == null || bool.booleanValue() != z) {
                ue4Var.e = Boolean.valueOf(z);
                if (ue4Var.c == i6) {
                    textView.clearAnimation();
                    textView.animate().translationX(z ? hl.L(i7 * (-7)) : 0.0f).setDuration(180L).setInterpolator(k43.h).start();
                } else {
                    textView.setTranslationX(z ? hl.L(i7 * (-7)) : 0.0f);
                }
            }
            ue4Var.d = z2;
            ue4Var.setWillNotDraw(!z2);
            ue4Var.c = i6;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        vnb vnbVar;
        int i2;
        View view;
        int i3;
        View view2;
        int i4;
        int i5;
        vnb vnbVar2;
        vnb vnbVar3;
        Context context = this.d;
        nf4 nf4Var = this.e;
        switch (i) {
            case 0:
                view2 = new mf5(context, 22);
                view = view2;
                break;
            case 1:
                vac vacVar = new vac(context, 6, 0, false);
                vacVar.setSelfAsSavedMessages(true);
                view = vacVar;
                break;
            case 2:
                wma wmaVar = (wma) nf4Var.fragmentView;
                String M0 = ob6.M0(2131750697, null);
                vnbVar = ((e) nf4Var).resourceProvider;
                if4 if4Var = new if4(this.d, wmaVar, M0, false, 12, vnbVar);
                nf4Var.L = if4Var;
                if4Var.r = false;
                if4Var.s = true;
                lt3 lt3Var = if4Var.b;
                lt3Var.getEditText().setEmojiColor(Integer.valueOf(nf4Var.getThemedColor(aob.Fi)));
                lt3Var.setEmojiViewCacheType(25);
                lt3Var.setText(nf4Var.x);
                i2 = ((e) nf4Var).currentAccount;
                wl.r(i2, nf4Var.y);
                xt3 editText = lt3Var.getEditText();
                editText.addTextChangedListener(new gi());
                editText.addTextChangedListener(new c7(this, (byte) 23));
                editText.setPadding(hl.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                lt3Var.getEditText().setImeOptions(268435462);
                view = if4Var;
                break;
            case 3:
                view = new sca(context, (uh9) null);
                break;
            case 4:
                ue4 ue4Var = new ue4(context);
                ue4Var.d = true;
                ue4Var.e = null;
                ImageView imageView = new ImageView(context);
                ue4Var.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                ue4Var.addView(imageView, tre.d(24, 24.0f, (ob6.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                ue4Var.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                int i6 = 24;
                if (ob6.a0) {
                    i3 = 24;
                    i6 = 0;
                } else {
                    i3 = 0;
                }
                textView.setPadding(i3, 0, i6, 0);
                textView.setGravity(ob6.a0 ? 5 : 3);
                boolean z = ob6.a0;
                ue4Var.addView(textView, tre.d(-1, -2.0f, 23, z ? 0.0f : 72.0f, 0.0f, z ? 72.0f : 0.0f, 0.0f));
                view = ue4Var;
                break;
            case 5:
                zc zcVar = new zc(context, (byte) 22);
                e29 e29Var = new e29(context);
                zcVar.b = e29Var;
                e29Var.f(R.raw.filter_new, 100, 100, null);
                e29Var.setScaleType(ImageView.ScaleType.CENTER);
                e29Var.d();
                zcVar.addView(e29Var, tre.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                e29Var.setOnClickListener(new mh3(zcVar, (byte) 13));
                view2 = zcVar;
                view = view2;
                break;
            case 6:
            default:
                view = new ilb(context);
                break;
            case 7:
                i4 = ((e) nf4Var).currentAccount;
                view = new jf4(this, this.d, nf4Var, i4, nf4Var.r.a);
                break;
            case 8:
                view = new we4(context);
                break;
            case 9:
                view = new cf4(nf4Var, context);
                break;
            case 10:
                Activity parentActivity = nf4Var.getParentActivity();
                i5 = ((e) nf4Var).currentAccount;
                vnbVar2 = ((e) nf4Var).resourceProvider;
                view = new d48(2, i5, vnbVar2, parentActivity);
                break;
            case 11:
                vnbVar3 = ((e) nf4Var).resourceProvider;
                view = new df4(context, vnbVar3);
                break;
        }
        return new n69(view);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        int i = f89Var.f;
        if (i == 2 || i != 9) {
            return;
        }
        cf4 cf4Var = (cf4) f89Var.a;
        nf4 nf4Var = this.e;
        cf4Var.e(hm.cloneSpans(nf4Var.x, -1, nf4Var.J.s.getPaint().getFontMetricsInt(), 0.5f), true);
    }

    @Override // j79
    public final void z(f89 f89Var) {
        if (f89Var.f == 2) {
            ot3 ot3Var = (ot3) f89Var.a;
            ot3Var.b.k(true);
            ot3Var.b.d();
        }
    }
}
