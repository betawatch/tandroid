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
import org.telegram.ui.wa1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t2(int i10, Object obj, Object obj2) {
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
        f2.n1 T;
        int i11 = this.a;
        int i12 = 10;
        int i13 = -1;
        int i14 = 2;
        boolean z10 = false;
        int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.y1) view).c(z11, true);
                ((ag.w0) obj).run();
                break;
            case 1:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.H0.run();
                ((org.telegram.ui.cu) obj).onClick(null, intValue);
                break;
            case 2:
                runnable = ((org.telegram.ui.ActionBar.a3) obj2).a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
            case 3:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 4:
                g8.E((g8) obj2, (float[]) obj);
                break;
            case 5:
                g8 g8Var = (g8) obj2;
                g8Var.getClass();
                ((j70) obj).u();
                g8Var.t0(7);
                break;
            case 6:
                n90 n90Var = (n90) obj;
                g8 g8Var2 = ((x7) obj2).B;
                i10 = ((org.telegram.ui.ActionBar.f3) g8Var2).currentAccount;
                LaunchActivity launchActivity = g8Var2.C0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(n90Var.getText().toString())) {
                    String charSequence = n90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof org.telegram.ui.fy) {
                        org.telegram.ui.fy fyVar = (org.telegram.ui.fy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = fyVar.getMessagesController().getTotalDialogsCount();
                        if (!fyVar.h2 && (totalDialogsCount > 10 || fyVar.G)) {
                            if (fyVar.f2) {
                                fyVar.T.r.setText(charSequence);
                                fyVar.T.r.setSelection(charSequence.length());
                                org.telegram.ui.ox oxVar = fyVar.y0;
                                if (oxVar != null && (L = oxVar.L(3)) >= 0 && fyVar.y0.getTabsView().getCurrentTabId() != L) {
                                    fyVar.y0.getTabsView().d(L, L);
                                }
                            } else {
                                fyVar.x = 3;
                                fyVar.T.r.setText(charSequence);
                                fyVar.T.r.setSelection(charSequence.length());
                            }
                            g8Var2.dismiss();
                            break;
                        }
                    }
                    org.telegram.ui.fy fyVar2 = new org.telegram.ui.fy(null);
                    fyVar2.j2 = charSequence;
                    fyVar2.x = 3;
                    launchActivity.q0(fyVar2, false, false);
                    g8Var2.dismiss();
                    break;
                }
                break;
            case 7:
                b9 b9Var = (b9) obj;
                ((boolean[]) obj2)[0] = true;
                b9Var.F.w1(b9Var.U);
                b9Var.O.dismiss();
                break;
            case 8:
                aa aaVar = (aa) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        ye.d.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        ye.d.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        break;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(aaVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = aaVar.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) aaVar.getContext(), aaVar.n.document)) {
                            FileLoader.getInstance(aaVar.s).loadFile(aaVar.n.document, "update", 3, 1);
                            aaVar.a(true);
                            break;
                        }
                    } else if (tL_help_appUpdate.url != null) {
                        ye.d.s(aaVar.getContext(), aaVar.n.url);
                        break;
                    }
                }
                break;
            case 9:
                ed edVar = (ed) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                j70 j70Var = edVar.T0;
                if (j70Var == null || !j70Var.D()) {
                    edVar.Z0.e(true);
                    j70 F = j70.F(frameLayout, new lh.b(), edVar.R0);
                    edVar.T0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    edVar.T0.k();
                    int[] iArr = edVar.Y0;
                    int length = iArr.length;
                    for (int i16 = 0; i16 < length; i16++) {
                        int i17 = iArr[i16];
                        edVar.T0.c(0, i17 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i17 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i17, new Object[0]), new i8(edVar, i17, i15), false);
                        if (edVar.X0 == i17) {
                            edVar.T0.L();
                        }
                    }
                    edVar.T0.Z();
                    break;
                } else {
                    edVar.T0.u();
                    edVar.T0 = null;
                    break;
                }
                break;
            case 10:
                yk ykVar = (yk) obj2;
                al alVar = (al) obj;
                bl blVar = ykVar.b;
                ni niVar = blVar.b;
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) niVar.b0;
                if (tnVar.c()) {
                    parentActivity = blVar.getParentActivity();
                    c5.M(parentActivity, tnVar.a(), new j1(12, ykVar, alVar), blVar.a);
                    break;
                } else {
                    c5.a0(niVar.F1, niVar.j1() + 1, niVar.n1(), new org.telegram.ui.tm(8, ykVar, alVar));
                    break;
                }
            case 11:
                on onVar = ((mn) obj2).d;
                wa1 wa1Var = onVar.s;
                View F2 = wa1Var.F((ln) obj);
                f2.n1 T2 = F2 != null ? wa1Var.T(F2) : null;
                if (T2 != null && (b10 = T2.b() - onVar.p0) >= 0 && b10 < onVar.G.length) {
                    on.O(onVar, b10);
                    break;
                }
                break;
            case 12:
                xn xnVar = (xn) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                org.telegram.ui.tn tnVar2 = xnVar.C;
                if (xnVar.P) {
                    tnVar2.showDialog(c5.V(xnVar.getContext(), tnVar2.h, c6Var).a);
                    break;
                } else {
                    tn tnVar3 = xnVar.e;
                    if (tnVar2.getParentActivity() != null) {
                        TLRPC.Chat chat = tnVar2.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = tnVar2.V7;
                            TLRPC.UserFull userFull = tnVar2.W7;
                            int i18 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            m8 m8Var = new m8(xnVar.getContext(), null, new un(xnVar, r3), true, 0, xnVar.W);
                            m8Var.b(i18);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m8Var.a;
                            vn vnVar = new vn(xnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.o1[] o1VarArr = {vnVar};
                            vnVar.e = true;
                            vnVar.c = 220;
                            vnVar.setOutsideTouchable(true);
                            o1VarArr[0].setClippingEnabled(true);
                            o1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            o1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            o1VarArr[0].setInputMethodMode(2);
                            o1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            o1VarArr[0].showAtLocation(tnVar3, 0, (int) (xnVar.getX() + tnVar3.getX()), (int) tnVar3.getY());
                            tnVar2.g8(false, true, 0.2f);
                            break;
                        } else if (xnVar.a.f && tnVar2.getParentActivity() != null && tnVar2.fragmentView != null && tnVar2.V7 != null) {
                            if (tnVar2.k2 == null) {
                                g40 g40Var = new g40(7, tnVar2.getParentActivity(), tnVar2.aa, true);
                                tnVar2.k2 = g40Var;
                                g40Var.setAlpha(0.0f);
                                tnVar2.k2.setVisibility(4);
                                tnVar2.k2.setShowingDuration(4000L);
                                tnVar2.T0.addView(tnVar2.k2, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i19 = tnVar2.V7.ttl_period;
                            tnVar2.k2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i19 > 86400 ? LocaleController.formatPluralString("Days", i19 / 86400, new Object[0]) : i19 >= 3600 ? LocaleController.formatPluralString("Hours", i19 / 3600, new Object[0]) : i19 >= 60 ? LocaleController.formatPluralString("Minutes", i19 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i19, new Object[0])));
                            tnVar2.k2.f(tnVar2.W0.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 13:
                gp.n((gp) obj2, (org.telegram.ui.tn) obj);
                break;
            case 14:
                fr.P((fr) obj2, (TLRPC.Peer) obj);
                break;
            case 15:
                or orVar = (or) obj2;
                String str = (String) obj;
                if (orVar.b == null && (view2 = orVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        orVar.b = (EditText) findFocus;
                    }
                }
                if (orVar.b != null) {
                    try {
                        orVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = orVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = orVar.b.getText();
                    int length2 = orVar.b.getSelectionEnd() == orVar.b.length() ? -1 : str.length() + orVar.b.getSelectionStart();
                    if (orVar.b.getSelectionStart() == -1 || orVar.b.getSelectionEnd() == -1) {
                        orVar.b.setText(str);
                        EditText editText2 = orVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = orVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), orVar.b.getSelectionEnd(), str));
                        EditText editText4 = orVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = orVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 16:
                as asVar = (as) obj2;
                zr zrVar = (zr) obj;
                asVar.I();
                zrVar.f = !zrVar.f;
                zrVar.j.T.N(true);
                asVar.s();
                break;
            case 17:
                ((as) obj2).x0 = !r13.x0;
                ((k51) obj).N(true);
                break;
            case 18:
                ((xs) obj2).dismiss();
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new org.telegram.ui.x6());
                break;
            case 19:
                jv.o((jv) obj2, (y5) obj);
                break;
            case 20:
                wy wyVar = (wy) obj2;
                org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) obj;
                fz fzVar = wyVar.v;
                lw lwVar = fzVar.z0;
                if (lwVar.indexOfChild(k8Var) != -1 && (T = lwVar.T(k8Var)) != null) {
                    if (T.b() == fzVar.b1) {
                        if (fzVar.d1 != null) {
                            fy fyVar3 = fzVar.p1;
                            if (fyVar3 != null) {
                                fyVar3.y(fzVar.F1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(fzVar.Y0).edit();
                            String str2 = "group_hide_stickers_" + fzVar.F1.id;
                            TLRPC.StickerSet stickerSet = fzVar.F1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            fzVar.Z(false);
                            wy wyVar2 = fzVar.u0;
                            if (wyVar2 != null) {
                                wyVar2.l();
                                break;
                            }
                        }
                    } else if (wyVar.h.get(T.b()) == fzVar.f1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new cv(wyVar, i14));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        c2Var.show();
                        TextView textView = (TextView) c2Var.d(-1);
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
                float f9 = fArr[i21];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.R, f9);
                fragmentContextView.l(playbackSpeed, f9, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - fragmentContextView.x0 > 300) {
                    int i22 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i22 > 2) {
                        i22 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i22).apply();
                    if (i22 >= 0 && fragmentContextView.h != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        org.telegram.ui.zi ziVar = new org.telegram.ui.zi(6, 2, fragmentContextView.getContext(), null, true);
                        fragmentContextView.w0 = ziVar;
                        ziVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
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
                x10 x10Var = (x10) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = x10Var.B.indexOf(v0Var.getFilter());
                if (x10Var.E != indexOf) {
                    x10Var.E = indexOf;
                    x10Var.f();
                    break;
                } else if (v0Var.getFilter().h) {
                    if (v0Var.a.f) {
                        rf.f0 filter = v0Var.getFilter();
                        x10Var.g(filter);
                        w10 w10Var = x10Var.D;
                        if (w10Var != null) {
                            ((org.telegram.ui.kx) w10Var).g(filter);
                            break;
                        }
                    } else {
                        v0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 23:
                ((y2) obj).run(Long.valueOf(((c20) obj2).d));
                break;
            case 24:
                ((org.telegram.ui.tp) obj).run();
                ((u30) obj2).dismiss();
                break;
            case 25:
                ((j70) obj2).u();
                ((org.telegram.ui.dc0) obj).run();
                break;
            case 26:
                j70 j70Var2 = (j70) obj2;
                ((org.telegram.ui.hv) obj).run();
                if (j70Var2.J) {
                    j70Var2.u();
                    break;
                }
                break;
            case 27:
                t70.m((t70) obj2, (r70) obj);
                break;
            case 28:
                ke0.m((ke0) obj2, (org.telegram.ui.ActionBar.c6) obj);
                break;
            default:
                ai0 ai0Var = (ai0) obj2;
                org.telegram.ui.xr xrVar = (org.telegram.ui.xr) obj;
                if (ai0Var.F.getTag() == null) {
                    int max = (int) Math.max(1.0f, ai0Var.getValue());
                    org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) xrVar.b;
                    TLRPC.User user = (TLRPC.User) xrVar.c;
                    if (rc0Var.getLocationController().getSharingLocationInfo(rc0Var.a0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(rc0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                        c2Var2.N = string2;
                        c2Var2.P = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new e3.d(rc0Var, user, max, i12));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        rc0Var.showDialog(c2Var2);
                    } else {
                        rc0Var.N.H = true;
                        rc0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        rc0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        rc0Var.getLocationController().setProximityLocation(rc0Var.a0, max, true);
                        z10 = true;
                    }
                    if (z10) {
                        ai0Var.a();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ t2(b9 b9Var, boolean[] zArr) {
        this.a = 7;
        this.c = b9Var;
        this.b = zArr;
    }
}
