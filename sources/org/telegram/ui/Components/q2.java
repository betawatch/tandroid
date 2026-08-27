package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        int i10;
        int L;
        Activity parentActivity;
        int b10;
        View view2;
        f2.o1 T;
        int i11 = this.a;
        int i12 = 10;
        int i13 = -1;
        int i14 = 2;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.y1) view).c(z11, true);
                ((cg.c) obj).run();
                break;
            case 1:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.H0.run();
                ((org.telegram.ui.eu) obj).onClick(null, intValue);
                break;
            case 2:
                runnable = ((org.telegram.ui.ActionBar.z2) obj2).a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
            case 3:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 4:
                b8.F((b8) obj2, (float[]) obj);
                break;
            case 5:
                b8 b8Var = (b8) obj2;
                b8Var.getClass();
                ((b70) obj).u();
                b8Var.t0(7);
                break;
            case 6:
                e90 e90Var = (e90) obj;
                b8 b8Var2 = ((s7) obj2).B;
                i10 = ((org.telegram.ui.ActionBar.e3) b8Var2).currentAccount;
                LaunchActivity launchActivity = b8Var2.C0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(e90Var.getText().toString())) {
                    String charSequence = e90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof org.telegram.ui.gy) {
                        org.telegram.ui.gy gyVar = (org.telegram.ui.gy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = gyVar.getMessagesController().getTotalDialogsCount();
                        if (!gyVar.h2 && (totalDialogsCount > 10 || gyVar.G)) {
                            if (gyVar.f2) {
                                gyVar.T.r.setText(charSequence);
                                gyVar.T.r.setSelection(charSequence.length());
                                org.telegram.ui.px pxVar = gyVar.y0;
                                if (pxVar != null && (L = pxVar.L(3)) >= 0 && gyVar.y0.getTabsView().getCurrentTabId() != L) {
                                    gyVar.y0.getTabsView().d(L, L);
                                }
                            } else {
                                gyVar.x = 3;
                                gyVar.T.r.setText(charSequence);
                                gyVar.T.r.setSelection(charSequence.length());
                            }
                            b8Var2.dismiss();
                            break;
                        }
                    }
                    org.telegram.ui.gy gyVar2 = new org.telegram.ui.gy(null);
                    gyVar2.j2 = charSequence;
                    gyVar2.x = 3;
                    launchActivity.q0(gyVar2, false, false);
                    b8Var2.dismiss();
                    break;
                }
                break;
            case 7:
                v8 v8Var = (v8) obj;
                ((boolean[]) obj2)[0] = true;
                v8Var.F.w1(v8Var.U);
                v8Var.O.dismiss();
                break;
            case 8:
                t9 t9Var = (t9) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        we.e.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        we.e.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        break;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(t9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = t9Var.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) t9Var.getContext(), t9Var.n.document)) {
                            FileLoader.getInstance(t9Var.s).loadFile(t9Var.n.document, "update", 3, 1);
                            t9Var.a(true);
                            break;
                        }
                    } else if (tL_help_appUpdate.url != null) {
                        we.e.s(t9Var.getContext(), t9Var.n.url);
                        break;
                    }
                }
                break;
            case 9:
                xc xcVar = (xc) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                b70 b70Var = xcVar.T0;
                if (b70Var == null || !b70Var.D()) {
                    xcVar.Z0.e(true);
                    b70 F = b70.F(frameLayout, new jh.b(), xcVar.R0);
                    xcVar.T0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    xcVar.T0.k();
                    int[] iArr = xcVar.Y0;
                    int length = iArr.length;
                    for (int i15 = 0; i15 < length; i15++) {
                        int i16 = iArr[i15];
                        xcVar.T0.c(0, i16 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i16 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i16, new Object[0]), new cg.w1(xcVar, i16, 28), false);
                        if (xcVar.X0 == i16) {
                            xcVar.T0.L();
                        }
                    }
                    xcVar.T0.Z();
                    break;
                } else {
                    xcVar.T0.u();
                    xcVar.T0 = null;
                    break;
                }
                break;
            case 10:
                qk qkVar = (qk) obj2;
                sk skVar = (sk) obj;
                tk tkVar = qkVar.b;
                gi giVar = tkVar.b;
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) giVar.b0;
                if (rnVar.c()) {
                    parentActivity = tkVar.getParentActivity();
                    y4.M(parentActivity, rnVar.a(), new g1(12, qkVar, skVar), tkVar.a);
                    break;
                } else {
                    y4.a0(giVar.F1, giVar.j1() + 1, giVar.n1(), new org.telegram.ui.df(15, qkVar, skVar));
                    break;
                }
            case 11:
                in inVar = ((gn) obj2).d;
                ta1 ta1Var = inVar.s;
                View F2 = ta1Var.F((fn) obj);
                f2.o1 T2 = F2 != null ? ta1Var.T(F2) : null;
                if (T2 != null && (b10 = T2.b() - inVar.p0) >= 0 && b10 < inVar.G.length) {
                    in.O(inVar, b10);
                    break;
                }
                break;
            case 12:
                rn rnVar2 = (rn) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                org.telegram.ui.rn rnVar3 = rnVar2.C;
                if (rnVar2.P) {
                    rnVar3.showDialog(y4.V(rnVar2.getContext(), rnVar3.h, c6Var).a);
                    break;
                } else {
                    nn nnVar = rnVar2.e;
                    if (rnVar3.getParentActivity() != null) {
                        TLRPC.Chat chat = rnVar3.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = rnVar3.V7;
                            TLRPC.UserFull userFull = rnVar3.W7;
                            int i17 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            g8 g8Var = new g8(rnVar2.getContext(), null, new on(rnVar2, r3), true, 0, rnVar2.W);
                            g8Var.b(i17);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g8Var.a;
                            pn pnVar = new pn(rnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.n1[] n1VarArr = {pnVar};
                            pnVar.e = true;
                            pnVar.c = 220;
                            pnVar.setOutsideTouchable(true);
                            n1VarArr[0].setClippingEnabled(true);
                            n1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            n1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            n1VarArr[0].setInputMethodMode(2);
                            n1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            n1VarArr[0].showAtLocation(nnVar, 0, (int) (rnVar2.getX() + nnVar.getX()), (int) nnVar.getY());
                            rnVar3.g8(false, true, 0.2f);
                            break;
                        } else if (rnVar2.a.f && rnVar3.getParentActivity() != null && rnVar3.fragmentView != null && rnVar3.V7 != null) {
                            if (rnVar3.k2 == null) {
                                x30 x30Var = new x30(7, rnVar3.getParentActivity(), rnVar3.aa, true);
                                rnVar3.k2 = x30Var;
                                x30Var.setAlpha(0.0f);
                                rnVar3.k2.setVisibility(4);
                                rnVar3.k2.setShowingDuration(4000L);
                                rnVar3.T0.addView(rnVar3.k2, h7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i18 = rnVar3.V7.ttl_period;
                            rnVar3.k2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i18 > 86400 ? LocaleController.formatPluralString("Days", i18 / 86400, new Object[0]) : i18 >= 3600 ? LocaleController.formatPluralString("Hours", i18 / 3600, new Object[0]) : i18 >= 60 ? LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i18, new Object[0])));
                            rnVar3.k2.f(rnVar3.W0.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 13:
                ap.n((ap) obj2, (org.telegram.ui.rn) obj);
                break;
            case 14:
                ar.P((ar) obj2, (TLRPC.Peer) obj);
                break;
            case 15:
                ir irVar = (ir) obj2;
                String str = (String) obj;
                if (irVar.b == null && (view2 = irVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        irVar.b = (EditText) findFocus;
                    }
                }
                if (irVar.b != null) {
                    try {
                        irVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = irVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = irVar.b.getText();
                    int length2 = irVar.b.getSelectionEnd() == irVar.b.length() ? -1 : str.length() + irVar.b.getSelectionStart();
                    if (irVar.b.getSelectionStart() == -1 || irVar.b.getSelectionEnd() == -1) {
                        irVar.b.setText(str);
                        EditText editText2 = irVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = irVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), irVar.b.getSelectionEnd(), str));
                        EditText editText4 = irVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = irVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 16:
                ur urVar = (ur) obj2;
                tr trVar = (tr) obj;
                urVar.J();
                trVar.f = !trVar.f;
                trVar.j.T.N(true);
                urVar.t();
                break;
            case 17:
                ((ur) obj2).x0 = !r13.x0;
                ((b51) obj).N(true);
                break;
            case 18:
                ((rs) obj2).dismiss();
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new org.telegram.ui.z6());
                break;
            case 19:
                cv.p((cv) obj2, (t5) obj);
                break;
            case 20:
                py pyVar = (py) obj2;
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) obj;
                yy yyVar = pyVar.v;
                ew ewVar = yyVar.z0;
                if (ewVar.indexOfChild(j8Var) != -1 && (T = ewVar.T(j8Var)) != null) {
                    if (T.b() == yyVar.b1) {
                        if (yyVar.d1 != null) {
                            xx xxVar = yyVar.p1;
                            if (xxVar != null) {
                                xxVar.y(yyVar.F1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(yyVar.Y0).edit();
                            String str2 = "group_hide_stickers_" + yyVar.F1.id;
                            TLRPC.StickerSet stickerSet = yyVar.F1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            yyVar.Z(false);
                            py pyVar2 = yyVar.u0;
                            if (pyVar2 != null) {
                                pyVar2.l();
                                break;
                            }
                        }
                    } else if (pyVar.h.get(T.b()) == yyVar.f1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pyVar.c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.N = string;
                        b2Var.P = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new vu(pyVar, i14));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        b2Var.show();
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                            break;
                        }
                    }
                }
                break;
            case 21:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.I0;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.R);
                int i19 = 0;
                while (true) {
                    if (i19 < 3) {
                        if (playbackSpeed - 0.1f <= fArr[i19]) {
                            i13 = i19;
                        } else {
                            i19++;
                        }
                    }
                }
                int i20 = i13 + 1;
                if (i20 >= 3) {
                    i20 = 0;
                }
                float f10 = fArr[i20];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.R, f10);
                fragmentContextView.l(playbackSpeed, f10, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - fragmentContextView.x0 > 300) {
                    int i21 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i21 > 2) {
                        i21 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i21).apply();
                    if (i21 >= 0 && fragmentContextView.h != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        org.telegram.ui.yi yiVar = new org.telegram.ui.yi(6, 2, fragmentContextView.getContext(), null, true);
                        fragmentContextView.w0 = yiVar;
                        yiVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                        fragmentContextView.w0.setText(LocaleController.getString(R.string.SpeedHint));
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                        ((ViewGroup) fragmentContextView.getParent()).addView(fragmentContextView.w0, marginLayoutParams);
                        fragmentContextView.w0.f(fragmentContextView.B, true);
                    }
                }
                fragmentContextView.x0 = currentTimeMillis;
                break;
            case 22:
                p10 p10Var = (p10) obj2;
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj;
                int indexOf = p10Var.B.indexOf(u0Var.getFilter());
                if (p10Var.E != indexOf) {
                    p10Var.E = indexOf;
                    p10Var.f();
                    break;
                } else if (u0Var.getFilter().h) {
                    if (u0Var.a.f) {
                        pf.e0 filter = u0Var.getFilter();
                        p10Var.g(filter);
                        o10 o10Var = p10Var.D;
                        if (o10Var != null) {
                            ((org.telegram.ui.lx) o10Var).e(filter);
                            break;
                        }
                    } else {
                        u0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 23:
                ((v2) obj).run(Long.valueOf(((u10) obj2).d));
                break;
            case 24:
                ((org.telegram.ui.sp) obj).run();
                ((l30) obj2).dismiss();
                break;
            case 25:
                ((b70) obj2).u();
                ((org.telegram.ui.v90) obj).run();
                break;
            case 26:
                b70 b70Var2 = (b70) obj2;
                ((org.telegram.ui.jv) obj).run();
                if (b70Var2.J) {
                    b70Var2.u();
                    break;
                }
                break;
            case 27:
                k70.m((k70) obj2, (i70) obj);
                break;
            case 28:
                be0.m((be0) obj2, (org.telegram.ui.ActionBar.c6) obj);
                break;
            default:
                sh0 sh0Var = (sh0) obj2;
                org.telegram.ui.zr zrVar = (org.telegram.ui.zr) obj;
                if (sh0Var.F.getTag() == null) {
                    int max = (int) Math.max(1.0f, sh0Var.getValue());
                    org.telegram.ui.tc0 tc0Var = (org.telegram.ui.tc0) zrVar.b;
                    TLRPC.User user = (TLRPC.User) zrVar.c;
                    if (tc0Var.getLocationController().getSharingLocationInfo(tc0Var.a0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                        b2Var2.N = string2;
                        b2Var2.P = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new c3.d(tc0Var, user, max, i12));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        tc0Var.showDialog(b2Var2);
                    } else {
                        tc0Var.N.H = true;
                        tc0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        tc0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        tc0Var.getLocationController().setProximityLocation(tc0Var.a0, max, true);
                        z10 = true;
                    }
                    if (z10) {
                        sh0Var.a();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ q2(v8 v8Var, boolean[] zArr) {
        this.a = 7;
        this.c = v8Var;
        this.b = zArr;
    }
}
