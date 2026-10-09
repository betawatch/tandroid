package org.telegram.ui;

import android.content.Context;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h extends org.telegram.ui.ActionBar.n2 implements LocationController.LocationFetchCallback {
    public org.telegram.ui.Components.fk0 a;
    public GradientDrawable b;
    public bi.o c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LinearLayout h;
    public final TextView[] n;
    public TextView r;
    public int[] s;
    public final int v;
    public boolean w;
    public rw x;
    public zb0 y;

    public h(int i10) {
        super(null);
        this.n = new TextView[6];
        this.v = i10;
    }

    public final void Z(Runnable runnable) {
        this.y = (zb0) runnable;
    }

    public final void a0(rw rwVar) {
        this.x = rwVar;
    }

    public final void b0() {
        GradientDrawable gradientDrawable = this.b;
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.i6.Ph)});
        this.c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        bi.o oVar = this.c;
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        oVar.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 0, x02, x02));
        int[] iArr = this.s;
        if (iArr == null || this.a == null) {
            return;
        }
        iArr[0] = 3355443;
        iArr[1] = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false);
        int[] iArr2 = this.s;
        iArr2[2] = 16777215;
        int i11 = org.telegram.ui.ActionBar.i6.d6;
        iArr2[3] = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
        int[] iArr3 = this.s;
        iArr3[4] = 5285866;
        iArr3[5] = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        int[] iArr4 = this.s;
        iArr4[6] = 2170912;
        iArr4[7] = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
        org.telegram.ui.Components.fk0 fk0Var = this.a;
        int[] iArr5 = this.s;
        org.telegram.ui.Components.ck0 ck0Var = fk0Var.b;
        if (ck0Var != null) {
            ck0Var.n = iArr5;
            ck0Var.G();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = 17;
        final int i11 = 0;
        if (kVar != null) {
            kVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.D(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.v8, false), false);
            this.actionBar.C(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.t8, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, i10));
        }
        f fVar = new f(this, context, i11);
        this.fragmentView = fVar;
        fVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i12 = 2;
        viewGroup.setOnTouchListener(new bi.d(2));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(context);
        this.a = fk0Var;
        viewGroup.addView(fk0Var);
        TextView textView = new TextView(context);
        this.e = textView;
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
        final int i14 = 1;
        this.e.setGravity(1);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i15 = this.v;
        if (i15 == 3) {
            i13 = org.telegram.ui.ActionBar.i6.Oh;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
        this.d.setGravity(1);
        float f10 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false));
        this.f.setGravity(1);
        this.f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f.setTextSize(1, 15.0f);
        if (i15 == 6 || i15 == 3) {
            f7 = 2.0f;
            this.f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f7 = 2.0f;
            this.f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f);
        int i16 = 5;
        if (i15 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
            this.h.setGravity(LocaleController.isRTL ? 5 : 3);
            viewGroup.addView(this.h);
            int i17 = 0;
            for (int i18 = 3; i17 < i18; i18 = 3) {
                LinearLayout e7 = org.telegram.messenger.bi.e(context, 0);
                this.h.addView(e7, w7.x5.k(0.0f, 0.0f, 0.0f, i17 != i12 ? 7.0f : 0.0f, -2, -2));
                int i19 = i17 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.n;
                textViewArr[i19] = textView4;
                int i20 = org.telegram.ui.ActionBar.i6.G6;
                textView4.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i20, false));
                textViewArr[i19].setGravity(LocaleController.isRTL ? i16 : 3);
                textViewArr[i19].setTextSize(1, f10);
                int i21 = i17 + 1;
                textViewArr[i19].setText(String.format(LocaleController.isRTL ? ".%d" : "%d.", Integer.valueOf(i21)));
                textViewArr[i19].setTypeface(AndroidUtilities.bold());
                int i22 = i19 + 1;
                TextView textView5 = new TextView(context);
                textViewArr[i22] = textView5;
                textView5.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i20, false));
                textViewArr[i22].setGravity(LocaleController.isRTL ? 5 : 3);
                textViewArr[i22].setTextSize(1, f10);
                if (i17 == 0) {
                    textViewArr[i22].setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.J6, false));
                    textViewArr[i22].setHighlightColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.K6, false));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i22].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.t61(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.t11) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i22].setText(spannableStringBuilder);
                } else if (i17 == 1) {
                    textViewArr[i22].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i22].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    e7.setGravity(5);
                    e7.addView(textViewArr[i22], w7.x5.l(1.0f, 0, -2));
                    e7.addView(textViewArr[i19], w7.x5.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    e7.addView(textViewArr[i19], w7.x5.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    e7.addView(textViewArr[i22], w7.x5.n(-2, -2));
                }
                i17 = i21;
                i16 = 5;
                i12 = 2;
                f10 = 15.0f;
            }
            this.f.setVisibility(8);
        }
        TextView textView6 = new TextView(context);
        this.r = textView6;
        textView6.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false));
        this.r.setGravity(1);
        this.r.setLineSpacing(AndroidUtilities.dp(f7), 1.0f);
        this.r.setTextSize(1, 13.0f);
        this.r.setVisibility(8);
        this.r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.r);
        this.b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        bi.o oVar = new bi.o(this, context);
        this.c = oVar;
        w7.z5.b(oVar, 0.02f, 1.2f);
        this.c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.c.setGravity(17);
        this.c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(AndroidUtilities.bold());
        bi.o oVar2 = this.c;
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        oVar2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 0, x02, x02));
        viewGroup.addView(this.c);
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        h hVar = this.b;
                        if (hVar.getParentActivity() != null) {
                            int i23 = hVar.v;
                            if (i23 == 0) {
                                hVar.presentFragment(new md(org.telegram.ui.Cells.c1.f(0, "step")), true);
                                break;
                            } else if (i23 == 3) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                hVar.showDialog(alertDialog$Builder.a);
                                break;
                            } else if (i23 == 5) {
                                if (hVar.getParentActivity() != null) {
                                    if (hVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                        v9.e0(hVar.getParentActivity(), false, 1, new g(hVar, 0));
                                        break;
                                    } else {
                                        hVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                        break;
                                    }
                                }
                            } else if (i23 == 6) {
                                hVar.presentFragment(new PasscodeActivity(1), true);
                                zb0 zb0Var = hVar.y;
                                if (zb0Var != null) {
                                    AndroidUtilities.runOnUIThread(zb0Var);
                                    hVar.y = null;
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        if (!hVar2.a.getAnimatedDrawable().k0) {
                            hVar2.a.getAnimatedDrawable().N(0, false, false);
                            hVar2.a.d();
                            break;
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        if (!hVar3.a.getAnimatedDrawable().k0) {
                            hVar3.a.getAnimatedDrawable().N(0, false, false);
                            hVar3.a.d();
                            break;
                        }
                        break;
                    default:
                        ((ActionBarLayout) this.b.getParentLayout()).l(true, false);
                        break;
                }
            }
        });
        if (i15 == 0) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.channel_create, 200, 200, null);
            this.e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.a.d();
            this.w = true;
        } else if (i15 == 3) {
            this.d.setVisibility(0);
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_change_number, 200, 200, null);
            final int i23 = 2;
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ h b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i23) {
                        case 0:
                            h hVar = this.b;
                            if (hVar.getParentActivity() != null) {
                                int i232 = hVar.v;
                                if (i232 == 0) {
                                    hVar.presentFragment(new md(org.telegram.ui.Cells.c1.f(0, "step")), true);
                                    break;
                                } else if (i232 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    hVar.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (i232 == 5) {
                                    if (hVar.getParentActivity() != null) {
                                        if (hVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            v9.e0(hVar.getParentActivity(), false, 1, new g(hVar, 0));
                                            break;
                                        } else {
                                            hVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (i232 == 6) {
                                    hVar.presentFragment(new PasscodeActivity(1), true);
                                    zb0 zb0Var = hVar.y;
                                    if (zb0Var != null) {
                                        AndroidUtilities.runOnUIThread(zb0Var);
                                        hVar.y = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            h hVar2 = this.b;
                            if (!hVar2.a.getAnimatedDrawable().k0) {
                                hVar2.a.getAnimatedDrawable().N(0, false, false);
                                hVar2.a.d();
                                break;
                            }
                            break;
                        case 2:
                            h hVar3 = this.b;
                            if (!hVar3.a.getAnimatedDrawable().k0) {
                                hVar3.a.getAnimatedDrawable().N(0, false, false);
                                hVar3.a.d();
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
                this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.bi.g(new StringBuilder("+"), user.phone, hf.b.c())));
            }
            final int i24 = 3;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ h b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i24) {
                        case 0:
                            h hVar = this.b;
                            if (hVar.getParentActivity() != null) {
                                int i232 = hVar.v;
                                if (i232 == 0) {
                                    hVar.presentFragment(new md(org.telegram.ui.Cells.c1.f(0, "step")), true);
                                    break;
                                } else if (i232 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    hVar.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (i232 == 5) {
                                    if (hVar.getParentActivity() != null) {
                                        if (hVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            v9.e0(hVar.getParentActivity(), false, 1, new g(hVar, 0));
                                            break;
                                        } else {
                                            hVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (i232 == 6) {
                                    hVar.presentFragment(new PasscodeActivity(1), true);
                                    zb0 zb0Var = hVar.y;
                                    if (zb0Var != null) {
                                        AndroidUtilities.runOnUIThread(zb0Var);
                                        hVar.y = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            h hVar2 = this.b;
                            if (!hVar2.a.getAnimatedDrawable().k0) {
                                hVar2.a.getAnimatedDrawable().N(0, false, false);
                                hVar2.a.d();
                                break;
                            }
                            break;
                        case 2:
                            h hVar3 = this.b;
                            if (!hVar3.a.getAnimatedDrawable().k0) {
                                hVar3.a.getAnimatedDrawable().N(0, false, false);
                                hVar3.a.d();
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
            org.telegram.messenger.q.n(R.string.PhoneNumberHelp, this.f);
            this.c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
            this.a.d();
            this.w = true;
        } else if (i15 == 5) {
            int[] iArr = new int[8];
            this.s = iArr;
            this.a.f(R.raw.qr_login, 334, 334, iArr);
            this.a.setScaleType(ImageView.ScaleType.CENTER);
            this.e.setText(LocaleController.getString(R.string.AuthAnotherClient));
            this.c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            this.a.d();
        } else if (i15 == 6) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_passcode, 200, 200, null);
            this.a.setFocusable(false);
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ h b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            h hVar = this.b;
                            if (hVar.getParentActivity() != null) {
                                int i232 = hVar.v;
                                if (i232 == 0) {
                                    hVar.presentFragment(new md(org.telegram.ui.Cells.c1.f(0, "step")), true);
                                    break;
                                } else if (i232 == 3) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    hVar.showDialog(alertDialog$Builder.a);
                                    break;
                                } else if (i232 == 5) {
                                    if (hVar.getParentActivity() != null) {
                                        if (hVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                                            v9.e0(hVar.getParentActivity(), false, 1, new g(hVar, 0));
                                            break;
                                        } else {
                                            hVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            break;
                                        }
                                    }
                                } else if (i232 == 6) {
                                    hVar.presentFragment(new PasscodeActivity(1), true);
                                    zb0 zb0Var = hVar.y;
                                    if (zb0Var != null) {
                                        AndroidUtilities.runOnUIThread(zb0Var);
                                        hVar.y = null;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            h hVar2 = this.b;
                            if (!hVar2.a.getAnimatedDrawable().k0) {
                                hVar2.a.getAnimatedDrawable().N(0, false, false);
                                hVar2.a.d();
                                break;
                            }
                            break;
                        case 2:
                            h hVar3 = this.b;
                            if (!hVar3.a.getAnimatedDrawable().k0) {
                                hVar3.a.getAnimatedDrawable().N(0, false, false);
                                hVar3.a.d();
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

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 0);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, eVar, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.v8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        }
        TextView textView = this.e;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(textView, 4, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.D6));
        TextView[] textViewArr = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[0], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[1], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[1], 2, null, null, null, null, org.telegram.ui.ActionBar.i6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[2], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[3], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[4], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[5], 4, null, null, null, null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.messenger.LocationController.LocationFetchCallback
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        TextView textView = this.d;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                v9.e0(getParentActivity(), false, 1, new g(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new c(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
            alertDialog$Builder.o();
        }
    }
}
