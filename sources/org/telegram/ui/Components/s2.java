package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
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
import org.telegram.ui.va1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s2(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i9;
        int L;
        Activity parentActivity;
        int b10;
        View view2;
        f2.q1 T;
        int i10 = this.a;
        int i11 = -1;
        int i12 = 2;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.H0.run();
                ((org.telegram.ui.bu) obj).onClick(null, intValue);
                break;
            case 1:
                ((org.telegram.ui.ActionBar.a3) obj2).a.dismissRunnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
            case 2:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 3:
                c8.E((c8) obj2, (float[]) obj);
                break;
            case 4:
                c8 c8Var = (c8) obj2;
                c8Var.getClass();
                ((x60) obj).u();
                c8Var.s0(7);
                break;
            case 5:
                a90 a90Var = (a90) obj;
                c8 c8Var2 = ((t7) obj2).B;
                i9 = ((org.telegram.ui.ActionBar.f3) c8Var2).currentAccount;
                LaunchActivity launchActivity = c8Var2.C0;
                if (MessagesController.getInstance(i9).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(a90Var.getText().toString())) {
                    String charSequence = a90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof org.telegram.ui.dy) {
                        org.telegram.ui.dy dyVar = (org.telegram.ui.dy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = dyVar.getMessagesController().getTotalDialogsCount();
                        if (!dyVar.h2 && (totalDialogsCount > 10 || dyVar.G)) {
                            if (dyVar.f2) {
                                dyVar.T.r.setText(charSequence);
                                dyVar.T.r.setSelection(charSequence.length());
                                org.telegram.ui.mx mxVar = dyVar.y0;
                                if (mxVar != null && (L = mxVar.L(3)) >= 0 && dyVar.y0.getTabsView().getCurrentTabId() != L) {
                                    dyVar.y0.getTabsView().d(L, L);
                                }
                            } else {
                                dyVar.x = 3;
                                dyVar.T.r.setText(charSequence);
                                dyVar.T.r.setSelection(charSequence.length());
                            }
                            c8Var2.dismiss();
                            break;
                        }
                    }
                    org.telegram.ui.dy dyVar2 = new org.telegram.ui.dy(null);
                    dyVar2.j2 = charSequence;
                    dyVar2.x = 3;
                    launchActivity.q0(dyVar2, false, false);
                    c8Var2.dismiss();
                    break;
                }
                break;
            case 6:
                w8 w8Var = (w8) obj2;
                ((boolean[]) obj)[0] = true;
                w8Var.F.w1(w8Var.U);
                w8Var.O.dismiss();
                break;
            case 7:
                v9 v9Var = (v9) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        ve.e.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        ve.e.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        break;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(v9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = v9Var.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) v9Var.getContext(), v9Var.n.document)) {
                            FileLoader.getInstance(v9Var.s).loadFile(v9Var.n.document, "update", 3, 1);
                            v9Var.a(true);
                            break;
                        }
                    } else if (tL_help_appUpdate.url != null) {
                        ve.e.s(v9Var.getContext(), v9Var.n.url);
                        break;
                    }
                }
                break;
            case 8:
                ad adVar = (ad) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                x60 x60Var = adVar.T0;
                if (x60Var == null || !x60Var.D()) {
                    adVar.Z0.e(true);
                    x60 F = x60.F(frameLayout, new ih.b(), adVar.R0);
                    adVar.T0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    adVar.T0.k();
                    int[] iArr = adVar.Y0;
                    int length = iArr.length;
                    for (int i13 = 0; i13 < length; i13++) {
                        int i14 = iArr[i13];
                        adVar.T0.c(0, i14 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i14 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i14, new Object[0]), new bg.c2(adVar, i14, 29), false);
                        if (adVar.X0 == i14) {
                            adVar.T0.L();
                        }
                    }
                    adVar.T0.Z();
                    break;
                } else {
                    adVar.T0.u();
                    adVar.T0 = null;
                    break;
                }
                break;
            case 9:
                uk ukVar = (uk) obj2;
                wk wkVar = (wk) obj;
                xk xkVar = ukVar.b;
                ki kiVar = xkVar.b;
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) kiVar.b0;
                if (qnVar.c()) {
                    parentActivity = xkVar.getParentActivity();
                    y4.M(parentActivity, qnVar.a(), new g1(12, ukVar, wkVar), xkVar.a);
                    break;
                } else {
                    y4.a0(kiVar.F1, kiVar.j1() + 1, kiVar.n1(), new org.telegram.ui.df(15, ukVar, wkVar));
                    break;
                }
            case 10:
                jn jnVar = ((hn) obj2).d;
                va1 va1Var = jnVar.s;
                View F2 = va1Var.F((gn) obj);
                f2.q1 T2 = F2 != null ? va1Var.T(F2) : null;
                if (T2 != null && (b10 = T2.b() - jnVar.p0) >= 0 && b10 < jnVar.G.length) {
                    jn.N(jnVar, b10);
                    break;
                }
                break;
            case 11:
                tn tnVar = (tn) obj2;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj;
                org.telegram.ui.qn qnVar2 = tnVar.C;
                if (tnVar.P) {
                    qnVar2.showDialog(y4.V(tnVar.getContext(), qnVar2.h, b6Var).a);
                    break;
                } else {
                    pn pnVar = tnVar.e;
                    if (qnVar2.getParentActivity() != null) {
                        TLRPC.Chat chat = qnVar2.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = qnVar2.V7;
                            TLRPC.UserFull userFull = qnVar2.W7;
                            int i15 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            h8 h8Var = new h8(tnVar.getContext(), null, new qn(tnVar, r3), true, 0, tnVar.W);
                            h8Var.b(i15);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h8Var.a;
                            rn rnVar = new rn(tnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.o1[] o1VarArr = {rnVar};
                            rnVar.e = true;
                            rnVar.c = 220;
                            rnVar.setOutsideTouchable(true);
                            o1VarArr[0].setClippingEnabled(true);
                            o1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            o1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            o1VarArr[0].setInputMethodMode(2);
                            o1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            o1VarArr[0].showAtLocation(pnVar, 0, (int) (tnVar.getX() + pnVar.getX()), (int) pnVar.getY());
                            qnVar2.g8(false, true, 0.2f);
                            break;
                        } else if (tnVar.a.f && qnVar2.getParentActivity() != null && qnVar2.fragmentView != null && qnVar2.V7 != null) {
                            if (qnVar2.k2 == null) {
                                s30 s30Var = new s30(7, qnVar2.getParentActivity(), qnVar2.aa, true);
                                qnVar2.k2 = s30Var;
                                s30Var.setAlpha(0.0f);
                                qnVar2.k2.setVisibility(4);
                                qnVar2.k2.setShowingDuration(4000L);
                                qnVar2.T0.addView(qnVar2.k2, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i16 = qnVar2.V7.ttl_period;
                            qnVar2.k2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i16 > 86400 ? LocaleController.formatPluralString("Days", i16 / 86400, new Object[0]) : i16 >= 3600 ? LocaleController.formatPluralString("Hours", i16 / 3600, new Object[0]) : i16 >= 60 ? LocaleController.formatPluralString("Minutes", i16 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i16, new Object[0])));
                            qnVar2.k2.f(qnVar2.W0.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 12:
                cp.n((cp) obj2, (org.telegram.ui.qn) obj);
                break;
            case 13:
                cr.O((cr) obj2, (TLRPC.Peer) obj);
                break;
            case 14:
                kr krVar = (kr) obj2;
                String str = (String) obj;
                if (krVar.b == null && (view2 = krVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        krVar.b = (EditText) findFocus;
                    }
                }
                if (krVar.b != null) {
                    try {
                        krVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = krVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = krVar.b.getText();
                    int length2 = krVar.b.getSelectionEnd() == krVar.b.length() ? -1 : str.length() + krVar.b.getSelectionStart();
                    if (krVar.b.getSelectionStart() == -1 || krVar.b.getSelectionEnd() == -1) {
                        krVar.b.setText(str);
                        EditText editText2 = krVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = krVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), krVar.b.getSelectionEnd(), str));
                        EditText editText4 = krVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = krVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 15:
                wr wrVar = (wr) obj2;
                vr vrVar = (vr) obj;
                wrVar.I();
                vrVar.f = !vrVar.f;
                vrVar.j.T.N(true);
                wrVar.s();
                break;
            case 16:
                ((wr) obj2).x0 = !r12.x0;
                ((z41) obj).N(true);
                break;
            case 17:
                ((ss) obj2).dismiss();
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new org.telegram.ui.y6());
                break;
            case 18:
                dv.o((dv) obj2, (t5) obj);
                break;
            case 19:
                ny nyVar = (ny) obj2;
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) obj;
                wy wyVar = nyVar.v;
                fw fwVar = wyVar.z0;
                if (fwVar.indexOfChild(m8Var) != -1 && (T = fwVar.T(m8Var)) != null) {
                    if (T.b() == wyVar.b1) {
                        if (wyVar.d1 != null) {
                            wx wxVar = wyVar.p1;
                            if (wxVar != null) {
                                wxVar.y(wyVar.F1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(wyVar.Y0).edit();
                            String str2 = "group_hide_stickers_" + wyVar.F1.id;
                            TLRPC.StickerSet stickerSet = wyVar.F1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            wyVar.Y(false);
                            ny nyVar2 = wyVar.u0;
                            if (nyVar2 != null) {
                                nyVar2.l();
                                break;
                            }
                        }
                    } else if (nyVar.h.get(T.b()) == wyVar.f1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nyVar.c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new wu(nyVar, i12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        c2Var.show();
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                            break;
                        }
                    }
                }
                break;
            case 20:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.I0;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.R);
                int i17 = 0;
                while (true) {
                    if (i17 < 3) {
                        if (playbackSpeed - 0.1f <= fArr[i17]) {
                            i11 = i17;
                        } else {
                            i17++;
                        }
                    }
                }
                int i18 = i11 + 1;
                if (i18 >= 3) {
                    i18 = 0;
                }
                float f10 = fArr[i18];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.R, f10);
                fragmentContextView.l(playbackSpeed, f10, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - fragmentContextView.x0 > 300) {
                    int i19 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i19 > 2) {
                        i19 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i19).apply();
                    if (i19 >= 0 && fragmentContextView.h != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        org.telegram.ui.wi wiVar = new org.telegram.ui.wi(6, 2, fragmentContextView.getContext(), null, true);
                        fragmentContextView.w0 = wiVar;
                        wiVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                        fragmentContextView.w0.setText(LocaleController.getString(R.string.SpeedHint));
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                        ((ViewGroup) fragmentContextView.getParent()).addView(fragmentContextView.w0, marginLayoutParams);
                        fragmentContextView.w0.f(fragmentContextView.B, true);
                    }
                }
                fragmentContextView.x0 = currentTimeMillis;
                break;
            case 21:
                m10 m10Var = (m10) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = m10Var.B.indexOf(v0Var.getFilter());
                if (m10Var.E != indexOf) {
                    m10Var.E = indexOf;
                    m10Var.f();
                    break;
                } else if (v0Var.getFilter().h) {
                    if (v0Var.a.f) {
                        of.m0 filter = v0Var.getFilter();
                        m10Var.g(filter);
                        l10 l10Var = m10Var.D;
                        if (l10Var != null) {
                            ((org.telegram.ui.ix) l10Var).e(filter);
                            break;
                        }
                    } else {
                        v0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 22:
                ((v2) obj).run(Long.valueOf(((r10) obj2).d));
                break;
            case 23:
                ((org.telegram.ui.qp) obj).run();
                ((g30) obj2).dismiss();
                break;
            case 24:
                ((x60) obj2).u();
                ((org.telegram.ui.r90) obj).run();
                break;
            case 25:
                x60 x60Var2 = (x60) obj2;
                ((org.telegram.ui.gv) obj).run();
                if (x60Var2.J) {
                    x60Var2.u();
                    break;
                }
                break;
            case 26:
                g70.m((g70) obj2, (e70) obj);
                break;
            case 27:
                wd0.m((wd0) obj2, (org.telegram.ui.ActionBar.b6) obj);
                break;
            case 28:
                qh0 qh0Var = (qh0) obj2;
                org.telegram.ui.yr yrVar = (org.telegram.ui.yr) obj;
                if (qh0Var.F.getTag() == null) {
                    int max = (int) Math.max(1.0f, qh0Var.getValue());
                    org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) yrVar.b;
                    TLRPC.User user = (TLRPC.User) yrVar.c;
                    if (pc0Var.getLocationController().getSharingLocationInfo(pc0Var.a0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(pc0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                        c2Var2.N = string2;
                        c2Var2.P = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new c3.e(pc0Var, user, max, 11));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        pc0Var.showDialog(c2Var2);
                    } else {
                        pc0Var.N.H = true;
                        pc0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        pc0Var.l0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        pc0Var.getLocationController().setProximityLocation(pc0Var.a0, max, true);
                        z10 = true;
                    }
                    if (z10) {
                        qh0Var.a();
                        break;
                    }
                }
                break;
            default:
                wh0 wh0Var = (wh0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(wh0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, wh0Var.getTitleView().getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e10) {
                        e10.printStackTrace();
                    }
                }
                break;
        }
    }
}
