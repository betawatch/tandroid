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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i extends org.telegram.ui.ActionBar.o2 implements LocationController.LocationFetchCallback {
    public org.telegram.ui.Components.aj0 a;
    public GradientDrawable b;
    public cg.s0 c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LinearLayout h;
    public final TextView[] n;
    public TextView r;
    public int[] s;
    public final int v;
    public boolean w;
    public xr x;
    public hb0 y;

    public i(int i10) {
        super(null);
        this.n = new TextView[6];
        this.v = i10;
    }

    public static void U(i iVar) {
        if (iVar.getParentActivity() == null) {
            return;
        }
        int i10 = iVar.v;
        if (i10 == 0) {
            iVar.presentFragment(new hd(a4.w.h(0, "step")), true);
            return;
        }
        if (i10 == 3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iVar.getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.PhoneNumberChangeTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.PhoneNumberAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Change), new d(iVar, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            iVar.showDialog(alertDialog$Builder.a);
            return;
        }
        if (i10 != 5) {
            if (i10 != 6) {
                return;
            }
            iVar.presentFragment(new PasscodeActivity(1), true);
            hb0 hb0Var = iVar.y;
            if (hb0Var != null) {
                AndroidUtilities.runOnUIThread(hb0Var);
                iVar.y = null;
                return;
            }
            return;
        }
        if (iVar.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && iVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            iVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            r9.e0(iVar.getParentActivity(), 1, new h(iVar, 0));
        }
    }

    public final void a0(Runnable runnable) {
        this.y = (hb0) runnable;
    }

    public final void b0(xr xrVar) {
        this.x = xrVar;
    }

    public final void c0() {
        GradientDrawable gradientDrawable = this.b;
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.g6.Ph)});
        this.c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        cg.s0 s0Var = this.c;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        s0Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, w02, w02));
        int[] iArr = this.s;
        if (iArr == null || this.a == null) {
            return;
        }
        iArr[0] = 3355443;
        iArr[1] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false);
        int[] iArr2 = this.s;
        iArr2[2] = 16777215;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        iArr2[3] = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int[] iArr3 = this.s;
        iArr3[4] = 5285866;
        iArr3[5] = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int[] iArr4 = this.s;
        iArr4[6] = 2170912;
        iArr4[7] = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        org.telegram.ui.Components.aj0 aj0Var = this.a;
        int[] iArr5 = this.s;
        org.telegram.ui.Components.xi0 xi0Var = aj0Var.b;
        if (xi0Var != null) {
            xi0Var.n = iArr5;
            xi0Var.E();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        float f9;
        float f10;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        final int i10 = 0;
        if (lVar != null) {
            lVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.v8, false), false);
            this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.t8, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 4));
        }
        g gVar = new g(this, context, i10);
        this.fragmentView = gVar;
        gVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i11 = 2;
        viewGroup.setOnTouchListener(new mh.d(2));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (lVar2 != null) {
            viewGroup.addView(lVar2);
        }
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        this.a = aj0Var;
        viewGroup.addView(aj0Var);
        TextView textView = new TextView(context);
        this.e = textView;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        final int i13 = 1;
        this.e.setGravity(1);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i14 = this.v;
        if (i14 == 3) {
            i12 = org.telegram.ui.ActionBar.g6.Oh;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
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
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.f.setGravity(1);
        this.f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f.setTextSize(1, 15.0f);
        if (i14 == 6 || i14 == 3) {
            f9 = 24.0f;
            f10 = 2.0f;
            this.f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f9 = 24.0f;
            f10 = 2.0f;
            this.f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f);
        if (i14 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(AndroidUtilities.dp(f9), 0, AndroidUtilities.dp(f9), 0);
            this.h.setGravity(LocaleController.isRTL ? 5 : 3);
            viewGroup.addView(this.h);
            int i15 = 0;
            for (int i16 = 3; i15 < i16; i16 = 3) {
                LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
                this.h.addView(g10, i7.f6.k(0.0f, 0.0f, 0.0f, i15 != i11 ? 7.0f : 0.0f, -2, -2));
                int i17 = i15 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.n;
                textViewArr[i17] = textView4;
                int i18 = org.telegram.ui.ActionBar.g6.G6;
                textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
                textViewArr[i17].setGravity(LocaleController.isRTL ? 5 : 3);
                textViewArr[i17].setTextSize(1, f11);
                int i19 = i15 + 1;
                textViewArr[i17].setText(String.format(LocaleController.isRTL ? ".%d" : "%d.", Integer.valueOf(i19)));
                textViewArr[i17].setTypeface(AndroidUtilities.bold());
                int i20 = i17 + 1;
                TextView textView5 = new TextView(context);
                textViewArr[i20] = textView5;
                textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
                textViewArr[i20].setGravity(LocaleController.isRTL ? 5 : 3);
                textViewArr[i20].setTextSize(1, f11);
                if (i15 == 0) {
                    textViewArr[i20].setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
                    textViewArr[i20].setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i20].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.a51(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.h01) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i20].setText(spannableStringBuilder);
                } else if (i15 == 1) {
                    textViewArr[i20].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i20].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    g10.setGravity(5);
                    g10.addView(textViewArr[i20], i7.f6.l(1.0f, 0, -2));
                    g10.addView(textViewArr[i17], i7.f6.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    g10.addView(textViewArr[i17], i7.f6.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    g10.addView(textViewArr[i20], i7.f6.n(-2, -2));
                }
                i15 = i19;
                i11 = 2;
                f11 = 15.0f;
            }
            this.f.setVisibility(8);
        }
        TextView textView6 = new TextView(context);
        this.r = textView6;
        textView6.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.r.setGravity(1);
        this.r.setLineSpacing(AndroidUtilities.dp(f10), 1.0f);
        this.r.setTextSize(1, 13.0f);
        this.r.setVisibility(8);
        this.r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.r);
        this.b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        cg.s0 s0Var = new cg.s0(this, context);
        this.c = s0Var;
        i7.h6.b(s0Var, 0.02f, 1.2f);
        this.c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.c.setGravity(17);
        this.c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(AndroidUtilities.bold());
        cg.s0 s0Var2 = this.c;
        int dp = AndroidUtilities.dp(f9);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        s0Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, w02, w02));
        viewGroup.addView(this.c);
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i.U(this.b);
                        break;
                    case 1:
                        i iVar = this.b;
                        if (!iVar.a.getAnimatedDrawable().h0) {
                            iVar.a.getAnimatedDrawable().L(0, false, false);
                            iVar.a.d();
                            break;
                        }
                        break;
                    case 2:
                        i iVar2 = this.b;
                        if (!iVar2.a.getAnimatedDrawable().h0) {
                            iVar2.a.getAnimatedDrawable().L(0, false, false);
                            iVar2.a.d();
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
            this.a.f(R.raw.channel_create, 200, 200, null);
            this.e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.a.d();
            this.w = true;
        } else if (i14 == 3) {
            this.d.setVisibility(0);
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_change_number, 200, 200, null);
            final int i21 = 2;
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e
                public final /* synthetic */ i b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i21) {
                        case 0:
                            i.U(this.b);
                            break;
                        case 1:
                            i iVar = this.b;
                            if (!iVar.a.getAnimatedDrawable().h0) {
                                iVar.a.getAnimatedDrawable().L(0, false, false);
                                iVar.a.d();
                                break;
                            }
                            break;
                        case 2:
                            i iVar2 = this.b;
                            if (!iVar2.a.getAnimatedDrawable().h0) {
                                iVar2.a.getAnimatedDrawable().L(0, false, false);
                                iVar2.a.d();
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
                this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.x3.k(new StringBuilder("+"), user.phone, qe.b.c())));
            }
            final int i22 = 3;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e
                public final /* synthetic */ i b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i22) {
                        case 0:
                            i.U(this.b);
                            break;
                        case 1:
                            i iVar = this.b;
                            if (!iVar.a.getAnimatedDrawable().h0) {
                                iVar.a.getAnimatedDrawable().L(0, false, false);
                                iVar.a.d();
                                break;
                            }
                            break;
                        case 2:
                            i iVar2 = this.b;
                            if (!iVar2.a.getAnimatedDrawable().h0) {
                                iVar2.a.getAnimatedDrawable().L(0, false, false);
                                iVar2.a.d();
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
            org.telegram.messenger.x3.r(R.string.PhoneNumberHelp, this.f);
            this.c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
            this.a.d();
            this.w = true;
        } else if (i14 == 5) {
            int[] iArr = new int[8];
            this.s = iArr;
            this.a.f(R.raw.qr_login, 334, 334, iArr);
            this.a.setScaleType(ImageView.ScaleType.CENTER);
            this.e.setText(LocaleController.getString(R.string.AuthAnotherClient));
            this.c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            this.a.d();
        } else if (i14 == 6) {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(R.raw.utyan_passcode, 200, 200, null);
            this.a.setFocusable(false);
            this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e
                public final /* synthetic */ i b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            i.U(this.b);
                            break;
                        case 1:
                            i iVar = this.b;
                            if (!iVar.a.getAnimatedDrawable().h0) {
                                iVar.a.getAnimatedDrawable().L(0, false, false);
                                iVar.a.d();
                                break;
                            }
                            break;
                        case 2:
                            i iVar2 = this.b;
                            if (!iVar2.a.getAnimatedDrawable().h0) {
                                iVar2.a.getAnimatedDrawable().L(0, false, false);
                                iVar2.a.d();
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

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 0);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, fVar, i10));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        }
        TextView textView = this.e;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, fVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        TextView[] textViewArr = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[0], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[1], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[1], 2, null, null, null, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[2], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[3], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[4], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[5], 4, null, null, null, null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, true)) > 0.699999988079071d;
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
                r9.e0(getParentActivity(), 1, new h(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new d(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }
}
