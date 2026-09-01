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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kb1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int L;
        Activity parentActivity;
        int b10;
        View view2;
        f2.m1 T;
        int i11 = this.a;
        int i12 = 10;
        int i13 = -1;
        int i14 = 2;
        int i15 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 1:
                c8.E((c8) obj2, (float[]) obj);
                break;
            case 2:
                c8 c8Var = (c8) obj2;
                c8Var.getClass();
                ((q70) obj).u();
                c8Var.t0(7);
                break;
            case 3:
                v90 v90Var = (v90) obj;
                c8 c8Var2 = ((t7) obj2).C;
                i10 = ((org.telegram.ui.ActionBar.h3) c8Var2).currentAccount;
                LaunchActivity launchActivity = c8Var2.D0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(v90Var.getText().toString())) {
                    String charSequence = v90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof org.telegram.ui.py) {
                        org.telegram.ui.py pyVar = (org.telegram.ui.py) launchActivity.O().getLastFragment();
                        int totalDialogsCount = pyVar.getMessagesController().getTotalDialogsCount();
                        if (!pyVar.i2 && (totalDialogsCount > 10 || pyVar.H)) {
                            if (pyVar.g2) {
                                pyVar.U.r.setText(charSequence);
                                pyVar.U.r.setSelection(charSequence.length());
                                org.telegram.ui.yx yxVar = pyVar.z0;
                                if (yxVar != null && (L = yxVar.L(3)) >= 0 && pyVar.z0.getTabsView().getCurrentTabId() != L) {
                                    pyVar.z0.getTabsView().d(L, L);
                                }
                            } else {
                                pyVar.x = 3;
                                pyVar.U.r.setText(charSequence);
                                pyVar.U.r.setSelection(charSequence.length());
                            }
                            c8Var2.dismiss();
                            break;
                        }
                    }
                    org.telegram.ui.py pyVar2 = new org.telegram.ui.py(null);
                    pyVar2.k2 = charSequence;
                    pyVar2.x = 3;
                    launchActivity.q0(pyVar2, false, false);
                    c8Var2.dismiss();
                    break;
                }
                break;
            case 4:
                w8 w8Var = (w8) obj;
                ((boolean[]) obj2)[0] = true;
                w8Var.G.w1(w8Var.V);
                w8Var.P.dismiss();
                break;
            case 5:
                v9 v9Var = (v9) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        af.g.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        af.g.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
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
                        af.g.s(v9Var.getContext(), v9Var.n.url);
                        break;
                    }
                }
                break;
            case 6:
                bd bdVar = (bd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                q70 q70Var = bdVar.U0;
                if (q70Var == null || !q70Var.D()) {
                    bdVar.a1.e(true);
                    q70 F = q70.F(frameLayout, new oh.b(), bdVar.S0);
                    bdVar.U0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    bdVar.U0.k();
                    int[] iArr = bdVar.Z0;
                    int length = iArr.length;
                    for (int i16 = 0; i16 < length; i16++) {
                        int i17 = iArr[i16];
                        bdVar.U0.c(0, i17 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i17 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i17, new Object[0]), new af.b(bdVar, i17, 28), false);
                        if (bdVar.Y0 == i17) {
                            bdVar.U0.L();
                        }
                    }
                    bdVar.U0.Z();
                    break;
                } else {
                    bdVar.U0.u();
                    bdVar.U0 = null;
                    break;
                }
                break;
            case 7:
                zk zkVar = (zk) obj2;
                bl blVar = (bl) obj;
                cl clVar = zkVar.b;
                mi miVar = clVar.b;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) miVar.c0;
                if (xnVar.c()) {
                    parentActivity = clVar.getParentActivity();
                    z4.M(parentActivity, xnVar.a(), new o1(11, zkVar, blVar), clVar.a);
                    break;
                } else {
                    z4.a0(miVar.G1, miVar.j1() + 1, miVar.n1(), new xk(i15, zkVar, blVar));
                    break;
                }
            case 8:
                sn snVar = ((qn) obj2).d;
                kb1 kb1Var = snVar.s;
                View F2 = kb1Var.F((pn) obj);
                f2.m1 T2 = F2 != null ? kb1Var.T(F2) : null;
                if (T2 != null && (b10 = T2.b() - snVar.q0) >= 0 && b10 < snVar.H.length) {
                    sn.O(snVar, b10);
                    break;
                }
                break;
            case 9:
                bo boVar = (bo) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                org.telegram.ui.xn xnVar2 = boVar.D;
                if (boVar.Q) {
                    xnVar2.showDialog(z4.V(boVar.getContext(), xnVar2.h, g6Var).a);
                    break;
                } else {
                    xn xnVar3 = boVar.e;
                    if (xnVar2.getParentActivity() != null) {
                        TLRPC.Chat chat = xnVar2.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = xnVar2.W7;
                            TLRPC.UserFull userFull = xnVar2.X7;
                            int i18 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            h8 h8Var = new h8(boVar.getContext(), null, new yn(boVar, r3), true, 0, boVar.a0);
                            h8Var.b(i18);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h8Var.a;
                            zn znVar = new zn(boVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.p1[] p1VarArr = {znVar};
                            znVar.e = true;
                            znVar.c = 220;
                            znVar.setOutsideTouchable(true);
                            p1VarArr[0].setClippingEnabled(true);
                            p1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            p1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            p1VarArr[0].setInputMethodMode(2);
                            p1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            p1VarArr[0].showAtLocation(xnVar3, 0, (int) (boVar.getX() + xnVar3.getX()), (int) xnVar3.getY());
                            xnVar2.g8(false, true, 0.2f);
                            break;
                        } else if (boVar.a.f && xnVar2.getParentActivity() != null && xnVar2.fragmentView != null && xnVar2.W7 != null) {
                            if (xnVar2.l2 == null) {
                                m40 m40Var = new m40(7, xnVar2.getParentActivity(), xnVar2.ba, true);
                                xnVar2.l2 = m40Var;
                                m40Var.setAlpha(0.0f);
                                xnVar2.l2.setVisibility(4);
                                xnVar2.l2.setShowingDuration(4000L);
                                xnVar2.U0.addView(xnVar2.l2, k7.c6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i19 = xnVar2.W7.ttl_period;
                            xnVar2.l2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i19 > 86400 ? LocaleController.formatPluralString("Days", i19 / 86400, new Object[0]) : i19 >= 3600 ? LocaleController.formatPluralString("Hours", i19 / 3600, new Object[0]) : i19 >= 60 ? LocaleController.formatPluralString("Minutes", i19 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i19, new Object[0])));
                            xnVar2.l2.f(xnVar2.X0.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 10:
                mp.n((mp) obj2, (org.telegram.ui.xn) obj);
                break;
            case 11:
                lr.P((lr) obj2, (TLRPC.Peer) obj);
                break;
            case 12:
                ur urVar = (ur) obj2;
                String str = (String) obj;
                if (urVar.b == null && (view2 = urVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        urVar.b = (EditText) findFocus;
                    }
                }
                if (urVar.b != null) {
                    try {
                        urVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = urVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = urVar.b.getText();
                    int length2 = urVar.b.getSelectionEnd() == urVar.b.length() ? -1 : str.length() + urVar.b.getSelectionStart();
                    if (urVar.b.getSelectionStart() == -1 || urVar.b.getSelectionEnd() == -1) {
                        urVar.b.setText(str);
                        EditText editText2 = urVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = urVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), urVar.b.getSelectionEnd(), str));
                        EditText editText4 = urVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = urVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 13:
                gs gsVar = (gs) obj2;
                fs fsVar = (fs) obj;
                gsVar.I();
                fsVar.f = !fsVar.f;
                fsVar.j.U.N(true);
                gsVar.s();
                break;
            case 14:
                ((gs) obj2).y0 = !r14.y0;
                ((x51) obj).N(true);
                break;
            case 15:
                ((dt) obj2).dismiss();
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new org.telegram.ui.b7());
                break;
            case 16:
                ov.o((ov) obj2, (u5) obj);
                break;
            case 17:
                dz dzVar = (dz) obj2;
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) obj;
                mz mzVar = dzVar.v;
                rw rwVar = mzVar.A0;
                if (rwVar.indexOfChild(m8Var) != -1 && (T = rwVar.T(m8Var)) != null) {
                    if (T.b() == mzVar.c1) {
                        if (mzVar.e1 != null) {
                            my myVar = mzVar.q1;
                            if (myVar != null) {
                                myVar.y(mzVar.G1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(mzVar.Z0).edit();
                            String str2 = "group_hide_stickers_" + mzVar.G1.id;
                            TLRPC.StickerSet stickerSet = mzVar.G1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            mzVar.Z(false);
                            dz dzVar2 = mzVar.v0;
                            if (dzVar2 != null) {
                                dzVar2.l();
                                break;
                            }
                        }
                    } else if (dzVar.h.get(T.b()) == mzVar.g1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dzVar.c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new hv(dzVar, i14));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        d2Var.show();
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                            break;
                        }
                    }
                }
                break;
            case 18:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.J0;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.S);
                int i20 = 0;
                while (true) {
                    if (i20 < 3) {
                        if (playbackSpeed - 0.1f <= fArr[i20]) {
                            i13 = i20;
                        } else {
                            i20++;
                        }
                    }
                }
                int i21 = i13 + 1;
                if (i21 >= 3) {
                    i21 = 0;
                }
                float f10 = fArr[i21];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.S, f10);
                fragmentContextView.l(playbackSpeed, f10, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - fragmentContextView.y0 > 300) {
                    int i22 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i22 > 2) {
                        i22 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i22).apply();
                    if (i22 >= 0 && fragmentContextView.h != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        org.telegram.ui.ej ejVar = new org.telegram.ui.ej(6, 2, fragmentContextView.getContext(), null, true);
                        fragmentContextView.x0 = ejVar;
                        ejVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                        fragmentContextView.x0.setText(LocaleController.getString(R.string.SpeedHint));
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                        ((ViewGroup) fragmentContextView.getParent()).addView(fragmentContextView.x0, marginLayoutParams);
                        fragmentContextView.x0.f(fragmentContextView.C, true);
                    }
                }
                fragmentContextView.y0 = currentTimeMillis;
                break;
            case 19:
                d20 d20Var = (d20) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = d20Var.C.indexOf(v0Var.getFilter());
                if (d20Var.F != indexOf) {
                    d20Var.F = indexOf;
                    d20Var.f();
                    break;
                } else if (v0Var.getFilter().h) {
                    if (v0Var.a.f) {
                        uf.e0 filter = v0Var.getFilter();
                        d20Var.g(filter);
                        c20 c20Var = d20Var.E;
                        if (c20Var != null) {
                            ((org.telegram.ui.ux) c20Var).d(filter);
                            break;
                        }
                    } else {
                        v0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 20:
                ((v2) obj).run(Long.valueOf(((i20) obj2).d));
                break;
            case 21:
                ((org.telegram.ui.aq) obj).run();
                ((a40) obj2).dismiss();
                break;
            case 22:
                ((q70) obj2).u();
                ((org.telegram.ui.jv0) obj).run();
                break;
            case 23:
                q70 q70Var2 = (q70) obj2;
                ((org.telegram.ui.qv) obj).run();
                if (q70Var2.J) {
                    q70Var2.u();
                    break;
                }
                break;
            case 24:
                a80.m((a80) obj2, (y70) obj);
                break;
            case 25:
                ue0.m((ue0) obj2, (org.telegram.ui.ActionBar.g6) obj);
                break;
            case 26:
                ni0 ni0Var = (ni0) obj2;
                org.telegram.ui.rs rsVar = (org.telegram.ui.rs) obj;
                if (ni0Var.G.getTag() == null) {
                    int max = (int) Math.max(1.0f, ni0Var.getValue());
                    org.telegram.ui.bd0 bd0Var = (org.telegram.ui.bd0) rsVar.b;
                    TLRPC.User user = (TLRPC.User) rsVar.c;
                    if (bd0Var.getLocationController().getSharingLocationInfo(bd0Var.b0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bd0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                        d2Var2.O = string2;
                        d2Var2.Q = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new e3.d(bd0Var, user, max, i12));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        bd0Var.showDialog(d2Var2);
                    } else {
                        bd0Var.O.I = true;
                        bd0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        bd0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        bd0Var.getLocationController().setProximityLocation(bd0Var.b0, max, true);
                        i15 = 1;
                    }
                    if (i15 != 0) {
                        ni0Var.a();
                        break;
                    }
                }
                break;
            case 27:
                si0 si0Var = (si0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(si0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, si0Var.getTitleView().getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e6) {
                        e6.printStackTrace();
                        return;
                    }
                }
                break;
            case 28:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                createChooser.setFlags(TLObject.FLAG_28);
                ((Context) obj).startActivity(createChooser);
                break;
            default:
                mh.l7 l7Var = (mh.l7) obj2;
                l7Var.e = !l7Var.e;
                ((lh.o3) obj).run();
                l7Var.i(true);
                break;
        }
    }

    public /* synthetic */ w2(w8 w8Var, boolean[] zArr) {
        this.a = 4;
        this.c = w8Var;
        this.b = zArr;
    }
}
