package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.os.Build;
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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h extends org.telegram.ui.ActionBar.p2 implements LocationController.LocationFetchCallback {
    public org.telegram.ui.Components.kj0 a;
    public GradientDrawable b;
    public ai.t c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LinearLayout h;
    public final TextView[] n;
    public TextView r;
    public int[] s;
    public final int v;
    public boolean w;
    public l80 x;
    public bc0 y;

    public h(int i10) {
        super(null);
        this.n = new TextView[6];
        this.v = i10;
    }

    public static void U(h hVar) {
        if (hVar.getParentActivity() == null) {
            return;
        }
        int i10 = hVar.v;
        if (i10 == 0) {
            hVar.presentFragment(new nd(org.telegram.ui.Cells.r6.e(0, "step")), true);
            return;
        }
        if (i10 == 3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PhoneNumberAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            hVar.showDialog(alertDialog$Builder.a);
            return;
        }
        if (i10 != 5) {
            if (i10 != 6) {
                return;
            }
            hVar.presentFragment(new PasscodeActivity(1), true);
            bc0 bc0Var = hVar.y;
            if (bc0Var != null) {
                AndroidUtilities.runOnUIThread(bc0Var);
                hVar.y = null;
                return;
            }
            return;
        }
        if (hVar.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && hVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            hVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            u9.e0(hVar.getParentActivity(), 1, new g(hVar, 0));
        }
    }

    public final void a0(Runnable runnable) {
        this.y = (bc0) runnable;
    }

    public final void b0(l80 l80Var) {
        this.x = l80Var;
    }

    public final void c0() {
        GradientDrawable gradientDrawable = this.b;
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.j6.Ph)});
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        ai.t tVar = this.c;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        tVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, w02, w02));
        int[] iArr = this.s;
        if (iArr == null || this.a == null) {
            return;
        }
        iArr[0] = 3355443;
        iArr[1] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false);
        int[] iArr2 = this.s;
        iArr2[2] = 16777215;
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        iArr2[3] = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int[] iArr3 = this.s;
        iArr3[4] = 5285866;
        iArr3[5] = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int[] iArr4 = this.s;
        iArr4[6] = 2170912;
        iArr4[7] = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        org.telegram.ui.Components.kj0 kj0Var = this.a;
        int[] iArr5 = this.s;
        org.telegram.ui.Components.hj0 hj0Var = kj0Var.b;
        if (hj0Var != null) {
            hj0Var.n = iArr5;
            hj0Var.G();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = 17;
        final int i11 = 0;
        if (lVar != null) {
            lVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.v8, false), false);
            this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.t8, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new di.w(this, i10));
        }
        f fVar = new f(this, context, i11);
        this.fragmentView = fVar;
        fVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i12 = 2;
        viewGroup.setOnTouchListener(new ai.h(2));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (lVar2 != null) {
            viewGroup.addView(lVar2);
        }
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
        this.a = kj0Var;
        viewGroup.addView(kj0Var);
        TextView textView = new TextView(context);
        this.e = textView;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        final int i14 = 1;
        this.e.setGravity(1);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i15 = this.v;
        if (i15 == 3) {
            i13 = org.telegram.ui.ActionBar.j6.Oh;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
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
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
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
        if (i15 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
            this.h.setGravity(LocaleController.isRTL ? 5 : 3);
            viewGroup.addView(this.h);
            int i16 = 0;
            for (int i17 = 3; i16 < i17; i17 = 3) {
                LinearLayout f11 = org.telegram.messenger.em.f(context, 0);
                this.h.addView(f11, w7.a6.k(0.0f, 0.0f, 0.0f, i16 != i12 ? 7.0f : 0.0f, -2, -2));
                int i18 = i16 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.n;
                textViewArr[i18] = textView4;
                int i19 = org.telegram.ui.ActionBar.j6.G6;
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                textViewArr[i18].setGravity(LocaleController.isRTL ? 5 : 3);
                textViewArr[i18].setTextSize(1, f10);
                int i20 = i16 + 1;
                textViewArr[i18].setText(String.format(LocaleController.isRTL ? ".%d" : "%d.", Integer.valueOf(i20)));
                textViewArr[i18].setTypeface(AndroidUtilities.bold());
                int i21 = i18 + 1;
                TextView textView5 = new TextView(context);
                textViewArr[i21] = textView5;
                textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                textViewArr[i21].setGravity(LocaleController.isRTL ? 5 : 3);
                textViewArr[i21].setTextSize(1, f10);
                if (i16 == 0) {
                    textViewArr[i21].setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
                    textViewArr[i21].setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i21].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.z51(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.b11) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i21].setText(spannableStringBuilder);
                } else if (i16 == 1) {
                    textViewArr[i21].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i21].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    f11.setGravity(5);
                    f11.addView(textViewArr[i21], w7.a6.l(1.0f, 0, -2));
                    f11.addView(textViewArr[i18], w7.a6.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f11.addView(textViewArr[i18], w7.a6.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    f11.addView(textViewArr[i21], w7.a6.n(-2, -2));
                }
                i16 = i20;
                i12 = 2;
                f10 = 15.0f;
            }
            this.f.setVisibility(8);
        }
        TextView textView6 = new TextView(context);
        this.r = textView6;
        textView6.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.r.setGravity(1);
        this.r.setLineSpacing(AndroidUtilities.dp(f7), 1.0f);
        this.r.setTextSize(1, 13.0f);
        this.r.setVisibility(8);
        this.r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.r);
        this.b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ai.t tVar = new ai.t(this, context);
        this.c = tVar;
        w7.c6.b(tVar, 0.02f, 1.2f);
        this.c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.c.setGravity(17);
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(AndroidUtilities.bold());
        ai.t tVar2 = this.c;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        tVar2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, w02, w02));
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
                        h.U(this.b);
                        break;
                    case 1:
                        h hVar = this.b;
                        if (!hVar.a.getAnimatedDrawable().l0) {
                            hVar.a.getAnimatedDrawable().N(0, false, false);
                            hVar.a.d();
                            break;
                        }
                        break;
                    case 2:
                        h hVar2 = this.b;
                        if (!hVar2.a.getAnimatedDrawable().l0) {
                            hVar2.a.getAnimatedDrawable().N(0, false, false);
                            hVar2.a.d();
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
            final int i22 = 2;
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ h b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i22) {
                        case 0:
                            h.U(this.b);
                            break;
                        case 1:
                            h hVar = this.b;
                            if (!hVar.a.getAnimatedDrawable().l0) {
                                hVar.a.getAnimatedDrawable().N(0, false, false);
                                hVar.a.d();
                                break;
                            }
                            break;
                        case 2:
                            h hVar2 = this.b;
                            if (!hVar2.a.getAnimatedDrawable().l0) {
                                hVar2.a.getAnimatedDrawable().N(0, false, false);
                                hVar2.a.d();
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
                this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.a2.j(new StringBuilder("+"), user.phone, gf.b.c())));
            }
            final int i23 = 3;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d
                public final /* synthetic */ h b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i23) {
                        case 0:
                            h.U(this.b);
                            break;
                        case 1:
                            h hVar = this.b;
                            if (!hVar.a.getAnimatedDrawable().l0) {
                                hVar.a.getAnimatedDrawable().N(0, false, false);
                                hVar.a.d();
                                break;
                            }
                            break;
                        case 2:
                            h hVar2 = this.b;
                            if (!hVar2.a.getAnimatedDrawable().l0) {
                                hVar2.a.getAnimatedDrawable().N(0, false, false);
                                hVar2.a.d();
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
            org.telegram.messenger.a2.n(R.string.PhoneNumberHelp, this.f);
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
                            h.U(this.b);
                            break;
                        case 1:
                            h hVar = this.b;
                            if (!hVar.a.getAnimatedDrawable().l0) {
                                hVar.a.getAnimatedDrawable().N(0, false, false);
                                hVar.a.d();
                                break;
                            }
                            break;
                        case 2:
                            h hVar2 = this.b;
                            if (!hVar2.a.getAnimatedDrawable().l0) {
                                hVar2.a.getAnimatedDrawable().N(0, false, false);
                                hVar2.a.d();
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
        c0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 0);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, eVar, i10));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        }
        TextView textView = this.e;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.D6));
        TextView[] textViewArr = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[0], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[1], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[1], 2, null, null, null, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[2], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[3], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[4], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[5], 4, null, null, null, null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.messenger.LocationController.LocationFetchCallback
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        TextView textView = this.d;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                u9.e0(getParentActivity(), 1, new g(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new c(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
            alertDialog$Builder.o();
        }
    }
}
