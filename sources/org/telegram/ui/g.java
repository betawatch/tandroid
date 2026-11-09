package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g extends org.telegram.ui.ActionBar.f2 {
    public n90 D;
    public final int[] E;
    public int F;
    public boolean G;
    public org.telegram.ui.Components.dh0 a;
    public GradientDrawable b;
    public ei.k c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LinearLayout h;
    public final TextView[] n;
    public TextView r;
    public int[] s;
    public final int w;
    public boolean x;
    public ru y;

    public g(int i7) {
        super(null);
        this.n = new TextView[6];
        this.E = new int[2];
        this.w = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = 3;
        final int i10 = 1;
        int i11 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (kVar != null) {
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, kVar, null);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.s6.l(this.actionBar, 1, org.telegram.ui.ActionBar.l6.v8, null);
            org.telegram.ui.ActionBar.s6.l(this.actionBar, 3, org.telegram.ui.ActionBar.l6.t8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 20));
        }
        e eVar = new e(i11, context, this);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, eVar, null);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i12 = 2;
        viewGroup.setOnTouchListener(new ei.b(i12));
        View view = this.actionBar;
        if (view != null) {
            viewGroup.addView(view);
        }
        org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(context);
        this.a = dh0Var;
        viewGroup.addView(dh0Var);
        TextView textView = new TextView(context);
        this.e = textView;
        int i13 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.U(textView, i13, null);
        this.e.setGravity(1);
        this.e.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i14 = this.w;
        if (i14 == 3) {
            i13 = org.telegram.ui.ActionBar.l6.Ci;
        }
        org.telegram.ui.ActionBar.s6.U(textView2, i13, null);
        this.d.setGravity(1);
        float f12 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.D6, null);
        this.f.setGravity(1);
        this.f.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.f.setTextSize(1, 15.0f);
        if (i14 == 6 || i14 == 3) {
            f10 = 24.0f;
            f11 = 2.0f;
            this.f.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
        } else {
            f10 = 24.0f;
            f11 = 2.0f;
            this.f.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        }
        viewGroup.addView(this.f);
        int i15 = 5;
        if (i14 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
            this.h.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
            viewGroup.addView(this.h);
            int i16 = 0;
            while (i16 < i7) {
                LinearLayout f13 = org.telegram.messenger.k5.f(context, 0);
                this.h.addView(f13, c8.ha.k(0.0f, 0.0f, 0.0f, i16 != i12 ? 7.0f : 0.0f, -2, -2));
                int i17 = i16 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.n;
                textViewArr[i17] = textView4;
                int i18 = org.telegram.ui.ActionBar.l6.G6;
                org.telegram.ui.ActionBar.s6.U(textView4, i18, null);
                textViewArr[i17].setGravity(org.telegram.messenger.id.a0 ? i15 : 3);
                textViewArr[i17].setTextSize(1, f12);
                int i19 = i16 + 1;
                textViewArr[i17].setText(String.format(org.telegram.messenger.id.a0 ? ".%d" : "%d.", Integer.valueOf(i19)));
                textViewArr[i17].setTypeface(org.telegram.messenger.g0.o());
                int i20 = i17 + 1;
                TextView textView5 = new TextView(context);
                textViewArr[i20] = textView5;
                org.telegram.ui.ActionBar.s6.U(textView5, i18, null);
                textViewArr[i20].setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
                textViewArr[i20].setTextSize(1, f12);
                if (i16 == 0) {
                    org.telegram.ui.ActionBar.s6.G(textViewArr[i20], org.telegram.ui.ActionBar.l6.J6, null);
                    org.telegram.ui.ActionBar.s6.C(textViewArr[i20], org.telegram.ui.ActionBar.l6.K6, null);
                    String M0 = org.telegram.messenger.id.M0(2131753892, null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i20].setMovementMethod(new org.telegram.messenger.c0((boolean) (objArr2 == true ? 1 : 0)));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.c41(org.telegram.messenger.id.M0(2131753893, null), (org.telegram.ui.Components.vy0) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i20].setText(spannableStringBuilder);
                } else if (i16 == 1) {
                    textViewArr[i20].setText(org.telegram.messenger.id.M0(2131753891, null));
                } else {
                    textViewArr[i20].setText(org.telegram.messenger.id.M0(2131753890, null));
                }
                if (org.telegram.messenger.id.a0) {
                    f13.setGravity(5);
                    f13.addView(textViewArr[i20], c8.ha.l(1.0f, 0, -2));
                    f13.addView(textViewArr[i17], c8.ha.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f13.addView(textViewArr[i17], c8.ha.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    f13.addView(textViewArr[i20], c8.ha.o(-2, -2));
                }
                i16 = i19;
                i7 = 3;
                i12 = 2;
                f12 = 15.0f;
                i15 = 5;
            }
            this.f.setVisibility(8);
        }
        TextView textView6 = new TextView(context);
        this.r = textView6;
        org.telegram.ui.ActionBar.s6.U(textView6, org.telegram.ui.ActionBar.l6.D6, null);
        this.r.setGravity(1);
        this.r.setLineSpacing(org.telegram.messenger.g0.L(f11), 1.0f);
        this.r.setTextSize(1, 13.0f);
        this.r.setVisibility(8);
        this.r.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        viewGroup.addView(this.r);
        this.b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ei.k kVar2 = new ei.k(this, context);
        this.c = kVar2;
        c8.ka.b(kVar2, 0.02f, 1.2f);
        this.c.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.c.setGravity(17);
        org.telegram.ui.ActionBar.s6.U(this.c, org.telegram.ui.ActionBar.l6.Gi, null);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(org.telegram.messenger.g0.o());
        ei.k kVar3 = this.c;
        int L = org.telegram.messenger.g0.L(f10);
        int i21 = org.telegram.ui.ActionBar.l6.Ei;
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, i21, false);
        org.telegram.ui.ActionBar.s6.Q(kVar3, org.telegram.ui.ActionBar.l6.k0(L, L, L, L, 0, x02, x02), null, org.telegram.ui.ActionBar.s6.M(i21), null);
        viewGroup.addView(this.c);
        ei.k kVar4 = this.c;
        final Object[] objArr3 = objArr == true ? 1 : 0;
        kVar4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (objArr3) {
                    case 0:
                        g gVar = this.b;
                        if (gVar.getParentActivity() != null) {
                            int i22 = gVar.w;
                            if (i22 == 0) {
                                gVar.presentFragment(new bd(rf.b.f(0, "step")), true);
                                break;
                            } else if (i22 == 3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131747287, null);
                                alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131747289, null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752552, null), new c(gVar, 1));
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                gVar.showDialog(alertDialog$Builder.a);
                                break;
                            } else if (i22 == 5) {
                                if (gVar.getParentActivity() != null) {
                                    if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                        s9.j0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                        break;
                                    } else {
                                        gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                        break;
                                    }
                                }
                            } else if (i22 == 6) {
                                gVar.presentFragment(new PasscodeActivity(1), true);
                                n90 n90Var = gVar.D;
                                if (n90Var != null) {
                                    org.telegram.messenger.g0.h3(n90Var);
                                    gVar.D = null;
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        if (!gVar2.a.getAnimatedDrawable().k0) {
                            gVar2.a.getAnimatedDrawable().N(0, false, false);
                            gVar2.a.d();
                            break;
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        if (!gVar3.a.getAnimatedDrawable().k0) {
                            gVar3.a.getAnimatedDrawable().N(0, false, false);
                            gVar3.a.d();
                            break;
                        }
                        break;
                    default:
                        ((ActionBarLayout) this.b.getParentLayout()).l(true, false);
                        break;
                }
            }
        });
        if (i14 == 0) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.channel_create, org.telegram.messenger.qs.e3, org.telegram.messenger.qs.e3, null);
            this.e.setText(org.telegram.messenger.id.M0(2131752468, null));
            this.f.setText(org.telegram.messenger.id.M0(2131752469, null));
            this.c.setText(org.telegram.messenger.id.M0(2131752470, null));
            this.a.d();
            this.x = true;
        } else if (i14 == 3) {
            this.d.setVisibility(0);
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_change_number, org.telegram.messenger.qs.e3, org.telegram.messenger.qs.e3, null);
            final int i22 = 2;
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i22) {
                        case 0:
                            g gVar = this.b;
                            if (gVar.getParentActivity() != null) {
                                int i222 = gVar.w;
                                if (i222 == 0) {
                                    gVar.presentFragment(new bd(rf.b.f(0, "step")), true);
                                    break;
                                } else if (i222 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                    alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131747287, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131747289, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752552, null), new c(gVar, 1));
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    gVar.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (i222 == 5) {
                                    if (gVar.getParentActivity() != null) {
                                        if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            s9.j0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                            break;
                                        } else {
                                            gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (i222 == 6) {
                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                    n90 n90Var = gVar.D;
                                    if (n90Var != null) {
                                        org.telegram.messenger.g0.h3(n90Var);
                                        gVar.D = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            g gVar2 = this.b;
                            if (!gVar2.a.getAnimatedDrawable().k0) {
                                gVar2.a.getAnimatedDrawable().N(0, false, false);
                                gVar2.a.d();
                                break;
                            }
                            break;
                        case 2:
                            g gVar3 = this.b;
                            if (!gVar3.a.getAnimatedDrawable().k0) {
                                gVar3.a.getAnimatedDrawable().N(0, false, false);
                                gVar3.a.d();
                                break;
                            }
                            break;
                        default:
                            ((ActionBarLayout) this.b.getParentLayout()).l(true, false);
                            break;
                    }
                }
            });
            org.telegram.messenger.p10 userConfig = getUserConfig();
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(userConfig.n));
            if (a22 == null) {
                a22 = userConfig.f();
            }
            if (a22 != null) {
                this.d.setText(org.telegram.messenger.id.a0("PhoneNumberKeepButton", null, 2131747284, org.telegram.messenger.k5.i(new StringBuilder("+"), a22.phone, pf.b.c())));
            }
            final int i23 = 3;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i23) {
                        case 0:
                            g gVar = this.b;
                            if (gVar.getParentActivity() != null) {
                                int i222 = gVar.w;
                                if (i222 == 0) {
                                    gVar.presentFragment(new bd(rf.b.f(0, "step")), true);
                                    break;
                                } else if (i222 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                    alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131747287, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131747289, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752552, null), new c(gVar, 1));
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    gVar.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (i222 == 5) {
                                    if (gVar.getParentActivity() != null) {
                                        if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            s9.j0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                            break;
                                        } else {
                                            gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (i222 == 6) {
                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                    n90 n90Var = gVar.D;
                                    if (n90Var != null) {
                                        org.telegram.messenger.g0.h3(n90Var);
                                        gVar.D = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            g gVar2 = this.b;
                            if (!gVar2.a.getAnimatedDrawable().k0) {
                                gVar2.a.getAnimatedDrawable().N(0, false, false);
                                gVar2.a.d();
                                break;
                            }
                            break;
                        case 2:
                            g gVar3 = this.b;
                            if (!gVar3.a.getAnimatedDrawable().k0) {
                                gVar3.a.getAnimatedDrawable().N(0, false, false);
                                gVar3.a.d();
                                break;
                            }
                            break;
                        default:
                            ((ActionBarLayout) this.b.getParentLayout()).l(true, false);
                            break;
                    }
                }
            });
            this.e.setText(org.telegram.messenger.id.M0(2131747288, null));
            this.f.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131747285, null)));
            this.c.setText(org.telegram.messenger.id.M0(2131747288, null));
            this.a.d();
            this.x = true;
        } else if (i14 == 5) {
            int[] iArr = new int[8];
            this.s = iArr;
            this.a.f(R.raw.qr_login, org.telegram.messenger.qs.F5, org.telegram.messenger.qs.F5, iArr);
            this.a.setScaleType(ImageView.ScaleType.CENTER);
            this.e.setText(org.telegram.messenger.id.M0(2131753894, null));
            this.c.setText(org.telegram.messenger.id.M0(2131753885, null));
            this.a.d();
        } else if (i14 == 6) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_passcode, org.telegram.messenger.qs.e3, org.telegram.messenger.qs.e3, null);
            this.a.setFocusable(false);
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            g gVar = this.b;
                            if (gVar.getParentActivity() != null) {
                                int i222 = gVar.w;
                                if (i222 == 0) {
                                    gVar.presentFragment(new bd(rf.b.f(0, "step")), true);
                                    break;
                                } else if (i222 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                    alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131747287, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131747289, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752552, null), new c(gVar, 1));
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    gVar.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (i222 == 5) {
                                    if (gVar.getParentActivity() != null) {
                                        if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            s9.j0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                            break;
                                        } else {
                                            gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (i222 == 6) {
                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                    n90 n90Var = gVar.D;
                                    if (n90Var != null) {
                                        org.telegram.messenger.g0.h3(n90Var);
                                        gVar.D = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            g gVar2 = this.b;
                            if (!gVar2.a.getAnimatedDrawable().k0) {
                                gVar2.a.getAnimatedDrawable().N(0, false, false);
                                gVar2.a.d();
                                break;
                            }
                            break;
                        case 2:
                            g gVar3 = this.b;
                            if (!gVar3.a.getAnimatedDrawable().k0) {
                                gVar3.a.getAnimatedDrawable().N(0, false, false);
                                gVar3.a.d();
                                break;
                            }
                            break;
                        default:
                            ((ActionBarLayout) this.b.getParentLayout()).l(true, false);
                            break;
                    }
                }
            });
            this.e.setText(org.telegram.messenger.id.M0(2131747657, null));
            this.f.setText(org.telegram.messenger.id.M0(2131752542, null));
            this.c.setText(org.telegram.messenger.id.M0(2131751155, null));
            this.a.d();
            this.x = true;
        }
        if (this.x) {
            this.c.setPadding(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(8.0f));
            this.c.setTextSize(1, 15.0f);
        }
        g0();
        return this.fragmentView;
    }

    public final void e0(Runnable runnable) {
        this.D = (n90) runnable;
    }

    public final void f0(ru ruVar) {
        this.y = ruVar;
    }

    public final void g0() {
        int i7 = org.telegram.ui.ActionBar.l6.Ci;
        int themedColor = getThemedColor(i7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.l6.Di);
        boolean z9 = this.G;
        int[] iArr = this.E;
        if (!z9 || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.G = true;
            this.b.setColors(iArr);
        }
        this.c.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gi, false));
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ei, false);
        if (this.c.getBackground() == null) {
            ei.k kVar = this.c;
            int L = org.telegram.messenger.g0.L(24.0f);
            kVar.setBackground(org.telegram.ui.ActionBar.l6.k0(L, L, L, L, 0, x02, x02));
        } else if (x02 != this.F) {
            org.telegram.ui.ActionBar.l6.H1(this.c.getBackground(), x02, true);
        }
        this.F = x02;
        int[] iArr2 = this.s;
        if (iArr2 == null || this.a == null) {
            return;
        }
        iArr2[0] = 3355443;
        iArr2[1] = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false);
        int[] iArr3 = this.s;
        iArr3[2] = 16777215;
        int i10 = org.telegram.ui.ActionBar.l6.d6;
        iArr3[3] = org.telegram.ui.ActionBar.l6.x0(null, i10, false);
        int[] iArr4 = this.s;
        iArr4[4] = 5285866;
        iArr4[5] = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        int[] iArr5 = this.s;
        iArr5[6] = 2170912;
        iArr5[7] = org.telegram.ui.ActionBar.l6.x0(null, i10, false);
        org.telegram.ui.Components.dh0 dh0Var = this.a;
        int[] iArr6 = this.s;
        org.telegram.ui.Components.ah0 ah0Var = dh0Var.b;
        if (ah0Var != null) {
            ah0Var.n = iArr6;
            ah0Var.G();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.n;
        TextView textView = textViewArr[0];
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i7 == 34) {
            int i10 = 0;
            if (iArr.length > 0 && iArr[0] == 0) {
                s9.j0(getParentActivity(), 1, new f(this, i10));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131746503, null));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747300, null), new c(this, i10));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751772, null), null);
            int i11 = org.telegram.ui.ActionBar.l6.L5;
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.l6.x0(null, i11, false), null);
            alertDialog$Builder.n(i11, null);
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        g0();
    }
}
