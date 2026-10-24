package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class g extends org.telegram.ui.ActionBar.o2 implements LocationController.LocationFetchCallback {
    public final int[] E;
    public int F;
    public boolean G;
    public org.telegram.ui.Components.bk0 a;
    public GradientDrawable b;
    public di.n c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LinearLayout h;
    public final TextView[] n;
    public TextView r;
    public int[] s;
    public final int v;
    public boolean w;
    public ks x;
    public kb0 y;

    public g(int i10) {
        super(null);
        this.n = new TextView[6];
        this.E = new int[2];
        this.v = i10;
    }

    public final void Z(Runnable runnable) {
        this.y = (kb0) runnable;
    }

    public final void a0(ks ksVar) {
        this.x = ksVar;
    }

    public final void b0() {
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Ph);
        boolean z10 = this.G;
        int[] iArr = this.E;
        if (!z10 || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.G = true;
            this.b.setColors(iArr);
        }
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        if (this.c.getBackground() == null) {
            di.n nVar = this.c;
            int dp = AndroidUtilities.dp(24.0f);
            nVar.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, x02, x02));
        } else if (x02 != this.F) {
            org.telegram.ui.ActionBar.k6.E1(this.c.getBackground(), x02, true);
        }
        this.F = x02;
        int[] iArr2 = this.s;
        if (iArr2 == null || this.a == null) {
            return;
        }
        iArr2[0] = 3355443;
        iArr2[1] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
        int[] iArr3 = this.s;
        iArr3[2] = 16777215;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        iArr3[3] = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int[] iArr4 = this.s;
        iArr4[4] = 5285866;
        iArr4[5] = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int[] iArr5 = this.s;
        iArr5[6] = 2170912;
        iArr5[7] = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        org.telegram.ui.Components.bk0 bk0Var = this.a;
        int[] iArr6 = this.s;
        org.telegram.ui.Components.yj0 yj0Var = bk0Var.b;
        if (yj0Var != null) {
            yj0Var.n = iArr6;
            yj0Var.G();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        float f7;
        float f10;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = 3;
        final int i13 = 1;
        int i14 = 0;
        if (kVar != null) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, kVar, null);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.v8, null);
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.t8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 19));
        }
        e eVar = new e(this, context, i14);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, eVar, null);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i15 = 2;
        viewGroup.setOnTouchListener(new di.d(2));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        this.a = bk0Var;
        viewGroup.addView(bk0Var);
        TextView textView = new TextView(context);
        this.e = textView;
        int i16 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i16, null);
        this.e.setGravity(1);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i17 = this.v;
        if (i17 == 3) {
            i16 = org.telegram.ui.ActionBar.k6.Oh;
        }
        org.telegram.ui.ActionBar.r6.W(textView2, i16, null);
        this.d.setGravity(1);
        float f11 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.D6, null);
        this.f.setGravity(1);
        this.f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f.setTextSize(1, 15.0f);
        if (i17 == 6 || i17 == 3) {
            f7 = 24.0f;
            f10 = 2.0f;
            this.f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f7 = 24.0f;
            f10 = 2.0f;
            this.f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f);
        if (i17 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
            this.h.setGravity(LocaleController.isRTL ? 5 : 3);
            viewGroup.addView(this.h);
            int i18 = 0;
            while (i18 < i12) {
                LinearLayout e = org.telegram.messenger.sl.e(context, i14);
                this.h.addView(e, w7.z5.k(0.0f, 0.0f, 0.0f, i18 != i15 ? 7.0f : 0.0f, -2, -2));
                int i19 = i18 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.n;
                textViewArr[i19] = textView4;
                int i20 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.W(textView4, i20, null);
                TextView textView5 = textViewArr[i19];
                if (LocaleController.isRTL) {
                    i10 = i14;
                    i11 = 5;
                } else {
                    i10 = i14;
                    i11 = 3;
                }
                textView5.setGravity(i11);
                textViewArr[i19].setTextSize(1, f11);
                TextView textView6 = textViewArr[i19];
                String str = LocaleController.isRTL ? ".%d" : "%d.";
                int i21 = i18 + 1;
                Object[] objArr = new Object[1];
                objArr[i10] = Integer.valueOf(i21);
                textView6.setText(String.format(str, objArr));
                textViewArr[i19].setTypeface(AndroidUtilities.bold());
                int i22 = i19 + 1;
                TextView textView7 = new TextView(context);
                textViewArr[i22] = textView7;
                org.telegram.ui.ActionBar.r6.W(textView7, i20, null);
                textViewArr[i22].setGravity(LocaleController.isRTL ? 5 : 3);
                textViewArr[i22].setTextSize(1, f11);
                if (i18 == 0) {
                    org.telegram.ui.ActionBar.r6.I(textViewArr[i22], org.telegram.ui.ActionBar.k6.J6, null);
                    org.telegram.ui.ActionBar.r6.E(textViewArr[i22], org.telegram.ui.ActionBar.k6.K6, null);
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i22].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.q11) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i22].setText(spannableStringBuilder);
                } else if (i18 == 1) {
                    textViewArr[i22].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i22].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    e.setGravity(5);
                    e.addView(textViewArr[i22], w7.z5.l(1.0f, i10, -2));
                    e.addView(textViewArr[i19], w7.z5.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    e.addView(textViewArr[i19], w7.z5.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    e.addView(textViewArr[i22], w7.z5.n(-2, -2));
                }
                i18 = i21;
                i12 = 3;
                i14 = 0;
                i15 = 2;
                f11 = 15.0f;
            }
            this.f.setVisibility(8);
        }
        TextView textView8 = new TextView(context);
        this.r = textView8;
        org.telegram.ui.ActionBar.r6.W(textView8, org.telegram.ui.ActionBar.k6.D6, null);
        this.r.setGravity(1);
        this.r.setLineSpacing(AndroidUtilities.dp(f10), 1.0f);
        this.r.setTextSize(1, 13.0f);
        this.r.setVisibility(8);
        this.r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.r);
        this.b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        di.n nVar = new di.n(this, context);
        this.c = nVar;
        w7.b6.b(nVar, 0.02f, 1.2f);
        this.c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.c.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(this.c, org.telegram.ui.ActionBar.k6.Sh, null);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(AndroidUtilities.bold());
        di.n nVar2 = this.c;
        int dp = AndroidUtilities.dp(f7);
        int i23 = org.telegram.ui.ActionBar.k6.Qh;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i23, false);
        org.telegram.ui.ActionBar.r6.S(nVar2, org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, x02, x02), null, org.telegram.ui.ActionBar.r6.O(i23), null);
        viewGroup.addView(this.c);
        final int i24 = 0;
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i24) {
                    case 0:
                        g gVar = this.b;
                        if (gVar.getParentActivity() != null) {
                            int i25 = gVar.v;
                            if (i25 == 0) {
                                gVar.presentFragment(new md(org.telegram.ui.Cells.b1.i(0, "step")), true);
                                break;
                            } else if (i25 == 3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(gVar, 1));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                gVar.showDialog(alertDialog$Builder.a);
                                break;
                            } else if (i25 == 5) {
                                if (gVar.getParentActivity() != null) {
                                    if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                        w9.e0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                        break;
                                    } else {
                                        gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                        break;
                                    }
                                }
                            } else if (i25 == 6) {
                                gVar.presentFragment(new PasscodeActivity(1), true);
                                kb0 kb0Var = gVar.y;
                                if (kb0Var != null) {
                                    AndroidUtilities.runOnUIThread(kb0Var);
                                    gVar.y = null;
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
        if (i17 == 0) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.channel_create, 200, 200, null);
            this.e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.a.d();
            this.w = true;
        } else if (i17 == 3) {
            this.d.setVisibility(0);
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_change_number, 200, 200, null);
            final int i25 = 2;
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i25) {
                        case 0:
                            g gVar = this.b;
                            if (gVar.getParentActivity() != null) {
                                int i252 = gVar.v;
                                if (i252 == 0) {
                                    gVar.presentFragment(new md(org.telegram.ui.Cells.b1.i(0, "step")), true);
                                    break;
                                } else if (i252 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(gVar, 1));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    gVar.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (i252 == 5) {
                                    if (gVar.getParentActivity() != null) {
                                        if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            w9.e0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                            break;
                                        } else {
                                            gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (i252 == 6) {
                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                    kb0 kb0Var = gVar.y;
                                    if (kb0Var != null) {
                                        AndroidUtilities.runOnUIThread(kb0Var);
                                        gVar.y = null;
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
            UserConfig userConfig = getUserConfig();
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
            if (user == null) {
                user = userConfig.getCurrentUser();
            }
            if (user != null) {
                this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.sl.h(new StringBuilder("+"), user.phone, jf.b.c())));
            }
            final int i26 = 3;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i26) {
                        case 0:
                            g gVar = this.b;
                            if (gVar.getParentActivity() != null) {
                                int i252 = gVar.v;
                                if (i252 == 0) {
                                    gVar.presentFragment(new md(org.telegram.ui.Cells.b1.i(0, "step")), true);
                                    break;
                                } else if (i252 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(gVar, 1));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    gVar.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (i252 == 5) {
                                    if (gVar.getParentActivity() != null) {
                                        if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            w9.e0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                            break;
                                        } else {
                                            gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (i252 == 6) {
                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                    kb0 kb0Var = gVar.y;
                                    if (kb0Var != null) {
                                        AndroidUtilities.runOnUIThread(kb0Var);
                                        gVar.y = null;
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
            this.e.setText(LocaleController.getString(R.string.PhoneNumberChange2));
            org.telegram.messenger.v0.m(R.string.PhoneNumberHelp, this.f);
            this.c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
            this.a.d();
            this.w = true;
        } else if (i17 == 5) {
            int[] iArr = new int[8];
            this.s = iArr;
            this.a.f(R.raw.qr_login, 334, 334, iArr);
            this.a.setScaleType(ImageView.ScaleType.CENTER);
            this.e.setText(LocaleController.getString(R.string.AuthAnotherClient));
            this.c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            this.a.d();
        } else if (i17 == 6) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_passcode, 200, 200, null);
            this.a.setFocusable(false);
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            g gVar = this.b;
                            if (gVar.getParentActivity() != null) {
                                int i252 = gVar.v;
                                if (i252 == 0) {
                                    gVar.presentFragment(new md(org.telegram.ui.Cells.b1.i(0, "step")), true);
                                    break;
                                } else if (i252 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(gVar, 1));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    gVar.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (i252 == 5) {
                                    if (gVar.getParentActivity() != null) {
                                        if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            w9.e0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                            break;
                                        } else {
                                            gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (i252 == 6) {
                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                    kb0 kb0Var = gVar.y;
                                    if (kb0Var != null) {
                                        AndroidUtilities.runOnUIThread(kb0Var);
                                        gVar.y = null;
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
            this.e.setText(LocaleController.getString(R.string.Passcode));
            this.f.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
            this.c.setText(LocaleController.getString(R.string.EnablePasscode));
            this.a.d();
            this.w = true;
        }
        if (this.w) {
            this.c.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.c.setTextSize(1, 15.0f);
        }
        b0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.n;
        TextView textView = textViewArr[0];
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.messenger.LocationController.LocationFetchCallback
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        TextView textView = this.d;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                w9.e0(getParentActivity(), 1, new f(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new c(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            int i11 = R.raw.permission_request_camera;
            int i12 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder.m(i11, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        b0();
    }
}
