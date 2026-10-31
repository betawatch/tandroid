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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends org.telegram.ui.ActionBar.k2 {
    public qa0 D;
    public final int[] E;
    public int F;
    public boolean G;
    public org.telegram.ui.Components.ei0 a;
    public GradientDrawable b;
    public bi.j6 c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LinearLayout h;
    public final TextView[] n;
    public TextView r;
    public int[] s;
    public final int w;
    public boolean x;
    public rv y;

    public f(int i10) {
        super(null);
        this.n = new TextView[6];
        this.E = new int[2];
        this.w = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = 3;
        final int i11 = 1;
        boolean z10 = false;
        Object[] objArr = 0;
        if (lVar != null) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, lVar, null);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, org.telegram.ui.ActionBar.t6.v8, null);
            org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.t8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new ag.e(this, 10));
        }
        jf.g gVar = new jf.g(this, context, i11);
        this.fragmentView = gVar;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, gVar, null);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        viewGroup.setOnTouchListener(new org.telegram.ui.ActionBar.n2(i11));
        View view = this.actionBar;
        if (view != null) {
            viewGroup.addView(view);
        }
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        this.a = ei0Var;
        viewGroup.addView(ei0Var);
        TextView textView = new TextView(context);
        this.e = textView;
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        this.e.setGravity(1);
        this.e.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i13 = this.w;
        if (i13 == 3) {
            i12 = org.telegram.ui.ActionBar.t6.Ci;
        }
        org.telegram.ui.ActionBar.a7.V(textView2, i12, null);
        this.d.setGravity(1);
        float f12 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.D6, null);
        this.f.setGravity(1);
        this.f.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        this.f.setTextSize(1, 15.0f);
        if (i13 == 6 || i13 == 3) {
            f7 = 32.0f;
            f10 = 24.0f;
            this.f.setPadding(org.telegram.messenger.i0.L(48.0f), 0, org.telegram.messenger.i0.L(48.0f), 0);
        } else {
            f7 = 32.0f;
            f10 = 24.0f;
            this.f.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        }
        viewGroup.addView(this.f);
        int i14 = 2;
        int i15 = 5;
        if (i13 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            f11 = 2.0f;
            this.h.setPadding(org.telegram.messenger.i0.L(f10), 0, org.telegram.messenger.i0.L(f10), 0);
            this.h.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
            viewGroup.addView(this.h);
            int i16 = 0;
            while (i16 < i10) {
                LinearLayout f13 = org.telegram.messenger.m5.f(context, 0);
                this.h.addView(f13, w7.b6.k(0.0f, 0.0f, 0.0f, i16 != i14 ? 7.0f : 0.0f, -2, -2));
                int i17 = i16 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.n;
                textViewArr[i17] = textView4;
                int i18 = org.telegram.ui.ActionBar.t6.G6;
                org.telegram.ui.ActionBar.a7.V(textView4, i18, null);
                textViewArr[i17].setGravity(org.telegram.messenger.cd.X ? i15 : 3);
                textViewArr[i17].setTextSize(1, f12);
                int i19 = i16 + 1;
                textViewArr[i17].setText(String.format(org.telegram.messenger.cd.X ? ".%d" : "%d.", Integer.valueOf(i19)));
                textViewArr[i17].setTypeface(org.telegram.messenger.i0.o());
                int i20 = i17 + 1;
                TextView textView5 = new TextView(context);
                textViewArr[i20] = textView5;
                org.telegram.ui.ActionBar.a7.V(textView5, i18, null);
                textViewArr[i20].setGravity(org.telegram.messenger.cd.X ? 5 : 3);
                textViewArr[i20].setTextSize(1, f12);
                if (i16 == 0) {
                    org.telegram.ui.ActionBar.a7.H(textViewArr[i20], org.telegram.ui.ActionBar.t6.J6, null);
                    org.telegram.ui.ActionBar.a7.D(textViewArr[i20], org.telegram.ui.ActionBar.t6.K6, null);
                    String L0 = org.telegram.messenger.cd.L0(2131753892, null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
                    int indexOf = L0.indexOf(42);
                    int lastIndexOf = L0.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i20].setMovementMethod(new org.telegram.messenger.e0(z10));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(org.telegram.messenger.cd.L0(2131753893, null), (org.telegram.ui.Components.yz0) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i20].setText(spannableStringBuilder);
                } else if (i16 == 1) {
                    textViewArr[i20].setText(org.telegram.messenger.cd.L0(2131753891, null));
                } else {
                    textViewArr[i20].setText(org.telegram.messenger.cd.L0(2131753890, null));
                }
                if (org.telegram.messenger.cd.X) {
                    f13.setGravity(5);
                    f13.addView(textViewArr[i20], w7.b6.l(1.0f, 0, -2));
                    f13.addView(textViewArr[i17], w7.b6.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f13.addView(textViewArr[i17], w7.b6.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    f13.addView(textViewArr[i20], w7.b6.o(-2, -2));
                }
                i16 = i19;
                i10 = 3;
                f12 = 15.0f;
                i14 = 2;
                i15 = 5;
            }
            this.f.setVisibility(8);
        } else {
            f11 = 2.0f;
        }
        TextView textView6 = new TextView(context);
        this.r = textView6;
        org.telegram.ui.ActionBar.a7.V(textView6, org.telegram.ui.ActionBar.t6.D6, null);
        this.r.setGravity(1);
        this.r.setLineSpacing(org.telegram.messenger.i0.L(f11), 1.0f);
        this.r.setTextSize(1, 13.0f);
        this.r.setVisibility(8);
        this.r.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
        viewGroup.addView(this.r);
        this.b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        bi.j6 j6Var = new bi.j6(this, context);
        this.c = j6Var;
        w7.e6.b(j6Var, 0.02f, 1.2f);
        this.c.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        this.c.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(this.c, org.telegram.ui.ActionBar.t6.Gi, null);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(org.telegram.messenger.i0.o());
        bi.j6 j6Var2 = this.c;
        int L = org.telegram.messenger.i0.L(f10);
        int i21 = org.telegram.ui.ActionBar.t6.Ei;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i21, false);
        org.telegram.ui.ActionBar.a7.R(j6Var2, org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, x02, x02), null, org.telegram.ui.ActionBar.a7.N(i21), null);
        viewGroup.addView(this.c);
        bi.j6 j6Var3 = this.c;
        final Object[] objArr2 = objArr == true ? 1 : 0;
        j6Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (objArr2) {
                    case 0:
                        f fVar = this.b;
                        if (fVar.getParentActivity() != null) {
                            int i22 = fVar.w;
                            if (i22 == 0) {
                                fVar.presentFragment(new kd(org.telegram.ui.Cells.f1.i(0, "step")), true);
                                break;
                            } else if (i22 == 3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fVar.getParentActivity());
                                alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131747303, null);
                                alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131747305, null);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752552, null), new c(fVar, 1));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                fVar.showDialog(alertDialog$Builder.a);
                                break;
                            } else if (i22 == 5) {
                                if (fVar.getParentActivity() != null) {
                                    if (fVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                        u9.i0(fVar.getParentActivity(), 1, new e(fVar, 0));
                                        break;
                                    } else {
                                        fVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                        break;
                                    }
                                }
                            } else if (i22 == 6) {
                                fVar.presentFragment(new PasscodeActivity(1), true);
                                qa0 qa0Var = fVar.D;
                                if (qa0Var != null) {
                                    org.telegram.messenger.i0.g3(qa0Var);
                                    fVar.D = null;
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        f fVar2 = this.b;
                        if (!fVar2.a.getAnimatedDrawable().k0) {
                            fVar2.a.getAnimatedDrawable().N(0, false, false);
                            fVar2.a.d();
                            break;
                        }
                        break;
                    case 2:
                        f fVar3 = this.b;
                        if (!fVar3.a.getAnimatedDrawable().k0) {
                            fVar3.a.getAnimatedDrawable().N(0, false, false);
                            fVar3.a.d();
                            break;
                        }
                        break;
                    default:
                        ((ActionBarLayout) this.b.getParentLayout()).l(true, false);
                        break;
                }
            }
        });
        if (i13 == 0) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.channel_create, org.telegram.messenger.zs.e3, org.telegram.messenger.zs.e3, null);
            this.e.setText(org.telegram.messenger.cd.L0(2131752468, null));
            this.f.setText(org.telegram.messenger.cd.L0(2131752469, null));
            this.c.setText(org.telegram.messenger.cd.L0(2131752470, null));
            this.a.d();
            this.x = true;
        } else if (i13 == 3) {
            this.d.setVisibility(0);
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_change_number, org.telegram.messenger.zs.e3, org.telegram.messenger.zs.e3, null);
            final int i22 = 2;
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i22) {
                        case 0:
                            f fVar = this.b;
                            if (fVar.getParentActivity() != null) {
                                int i222 = fVar.w;
                                if (i222 == 0) {
                                    fVar.presentFragment(new kd(org.telegram.ui.Cells.f1.i(0, "step")), true);
                                    break;
                                } else if (i222 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fVar.getParentActivity());
                                    alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131747303, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131747305, null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752552, null), new c(fVar, 1));
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    fVar.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (i222 == 5) {
                                    if (fVar.getParentActivity() != null) {
                                        if (fVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            u9.i0(fVar.getParentActivity(), 1, new e(fVar, 0));
                                            break;
                                        } else {
                                            fVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (i222 == 6) {
                                    fVar.presentFragment(new PasscodeActivity(1), true);
                                    qa0 qa0Var = fVar.D;
                                    if (qa0Var != null) {
                                        org.telegram.messenger.i0.g3(qa0Var);
                                        fVar.D = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            f fVar2 = this.b;
                            if (!fVar2.a.getAnimatedDrawable().k0) {
                                fVar2.a.getAnimatedDrawable().N(0, false, false);
                                fVar2.a.d();
                                break;
                            }
                            break;
                        case 2:
                            f fVar3 = this.b;
                            if (!fVar3.a.getAnimatedDrawable().k0) {
                                fVar3.a.getAnimatedDrawable().N(0, false, false);
                                fVar3.a.d();
                                break;
                            }
                            break;
                        default:
                            ((ActionBarLayout) this.b.getParentLayout()).l(true, false);
                            break;
                    }
                }
            });
            org.telegram.messenger.d20 userConfig = getUserConfig();
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(userConfig.n));
            if (Z1 == null) {
                Z1 = userConfig.f();
            }
            if (Z1 != null) {
                this.d.setText(org.telegram.messenger.cd.a0("PhoneNumberKeepButton", null, 2131747300, org.telegram.messenger.m5.h(new StringBuilder("+"), Z1.phone, af.b.c())));
            }
            final int i23 = 3;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i23) {
                        case 0:
                            f fVar = this.b;
                            if (fVar.getParentActivity() != null) {
                                int i222 = fVar.w;
                                if (i222 == 0) {
                                    fVar.presentFragment(new kd(org.telegram.ui.Cells.f1.i(0, "step")), true);
                                    break;
                                } else if (i222 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fVar.getParentActivity());
                                    alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131747303, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131747305, null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752552, null), new c(fVar, 1));
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    fVar.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (i222 == 5) {
                                    if (fVar.getParentActivity() != null) {
                                        if (fVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            u9.i0(fVar.getParentActivity(), 1, new e(fVar, 0));
                                            break;
                                        } else {
                                            fVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (i222 == 6) {
                                    fVar.presentFragment(new PasscodeActivity(1), true);
                                    qa0 qa0Var = fVar.D;
                                    if (qa0Var != null) {
                                        org.telegram.messenger.i0.g3(qa0Var);
                                        fVar.D = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            f fVar2 = this.b;
                            if (!fVar2.a.getAnimatedDrawable().k0) {
                                fVar2.a.getAnimatedDrawable().N(0, false, false);
                                fVar2.a.d();
                                break;
                            }
                            break;
                        case 2:
                            f fVar3 = this.b;
                            if (!fVar3.a.getAnimatedDrawable().k0) {
                                fVar3.a.getAnimatedDrawable().N(0, false, false);
                                fVar3.a.d();
                                break;
                            }
                            break;
                        default:
                            ((ActionBarLayout) this.b.getParentLayout()).l(true, false);
                            break;
                    }
                }
            });
            this.e.setText(org.telegram.messenger.cd.L0(2131747304, null));
            this.f.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747301, null)));
            this.c.setText(org.telegram.messenger.cd.L0(2131747304, null));
            this.a.d();
            this.x = true;
        } else if (i13 == 5) {
            int[] iArr = new int[8];
            this.s = iArr;
            this.a.f(R.raw.qr_login, org.telegram.messenger.zs.F5, org.telegram.messenger.zs.F5, iArr);
            this.a.setScaleType(ImageView.ScaleType.CENTER);
            this.e.setText(org.telegram.messenger.cd.L0(2131753894, null));
            this.c.setText(org.telegram.messenger.cd.L0(2131753885, null));
            this.a.d();
        } else if (i13 == 6) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_passcode, org.telegram.messenger.zs.e3, org.telegram.messenger.zs.e3, null);
            this.a.setFocusable(false);
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            f fVar = this.b;
                            if (fVar.getParentActivity() != null) {
                                int i222 = fVar.w;
                                if (i222 == 0) {
                                    fVar.presentFragment(new kd(org.telegram.ui.Cells.f1.i(0, "step")), true);
                                    break;
                                } else if (i222 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fVar.getParentActivity());
                                    alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131747303, null);
                                    alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131747305, null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752552, null), new c(fVar, 1));
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    fVar.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (i222 == 5) {
                                    if (fVar.getParentActivity() != null) {
                                        if (fVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            u9.i0(fVar.getParentActivity(), 1, new e(fVar, 0));
                                            break;
                                        } else {
                                            fVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (i222 == 6) {
                                    fVar.presentFragment(new PasscodeActivity(1), true);
                                    qa0 qa0Var = fVar.D;
                                    if (qa0Var != null) {
                                        org.telegram.messenger.i0.g3(qa0Var);
                                        fVar.D = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            f fVar2 = this.b;
                            if (!fVar2.a.getAnimatedDrawable().k0) {
                                fVar2.a.getAnimatedDrawable().N(0, false, false);
                                fVar2.a.d();
                                break;
                            }
                            break;
                        case 2:
                            f fVar3 = this.b;
                            if (!fVar3.a.getAnimatedDrawable().k0) {
                                fVar3.a.getAnimatedDrawable().N(0, false, false);
                                fVar3.a.d();
                                break;
                            }
                            break;
                        default:
                            ((ActionBarLayout) this.b.getParentLayout()).l(true, false);
                            break;
                    }
                }
            });
            this.e.setText(org.telegram.messenger.cd.L0(2131747673, null));
            this.f.setText(org.telegram.messenger.cd.L0(2131752542, null));
            this.c.setText(org.telegram.messenger.cd.L0(2131751156, null));
            this.a.d();
            this.x = true;
        }
        if (this.x) {
            this.c.setPadding(org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(8.0f));
            this.c.setTextSize(1, 15.0f);
        }
        f0();
        return this.fragmentView;
    }

    public final void d0(Runnable runnable) {
        this.D = (qa0) runnable;
    }

    public final void e0(rv rvVar) {
        this.y = rvVar;
    }

    public final void f0() {
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.Di);
        boolean z10 = this.G;
        int[] iArr = this.E;
        if (!z10 || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.G = true;
            this.b.setColors(iArr);
        }
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        if (this.c.getBackground() == null) {
            bi.j6 j6Var = this.c;
            int L = org.telegram.messenger.i0.L(24.0f);
            j6Var.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, x02, x02));
        } else if (x02 != this.F) {
            org.telegram.ui.ActionBar.t6.H1(this.c.getBackground(), x02, true);
        }
        this.F = x02;
        int[] iArr2 = this.s;
        if (iArr2 == null || this.a == null) {
            return;
        }
        iArr2[0] = 3355443;
        iArr2[1] = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
        int[] iArr3 = this.s;
        iArr3[2] = 16777215;
        int i11 = org.telegram.ui.ActionBar.t6.d6;
        iArr3[3] = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        int[] iArr4 = this.s;
        iArr4[4] = 5285866;
        iArr4[5] = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        int[] iArr5 = this.s;
        iArr5[6] = 2170912;
        iArr5[7] = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        org.telegram.ui.Components.ei0 ei0Var = this.a;
        int[] iArr6 = this.s;
        org.telegram.ui.Components.bi0 bi0Var = ei0Var.b;
        if (bi0Var != null) {
            bi0Var.n = iArr6;
            bi0Var.G();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.n;
        TextView textView = textViewArr[0];
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            int i11 = 0;
            if (iArr.length > 0 && iArr[0] == 0) {
                u9.i0(getParentActivity(), 1, new e(this, i11));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131746518, null));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747316, null), new c(this, i11));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), null);
            int i12 = org.telegram.ui.ActionBar.t6.L5;
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.t6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        f0();
    }
}
