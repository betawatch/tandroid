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
import org.telegram.ui.jb1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        f2.l1 T;
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
                ((o70) obj).u();
                c8Var.t0(7);
                break;
            case 3:
                t90 t90Var = (t90) obj;
                c8 c8Var2 = ((t7) obj2).C;
                i10 = ((org.telegram.ui.ActionBar.g3) c8Var2).currentAccount;
                LaunchActivity launchActivity = c8Var2.D0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(t90Var.getText().toString())) {
                    String charSequence = t90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof org.telegram.ui.oy) {
                        org.telegram.ui.oy oyVar = (org.telegram.ui.oy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = oyVar.getMessagesController().getTotalDialogsCount();
                        if (!oyVar.i2 && (totalDialogsCount > 10 || oyVar.H)) {
                            if (oyVar.g2) {
                                oyVar.U.r.setText(charSequence);
                                oyVar.U.r.setSelection(charSequence.length());
                                org.telegram.ui.xx xxVar = oyVar.z0;
                                if (xxVar != null && (L = xxVar.L(3)) >= 0 && oyVar.z0.getTabsView().getCurrentTabId() != L) {
                                    oyVar.z0.getTabsView().d(L, L);
                                }
                            } else {
                                oyVar.x = 3;
                                oyVar.U.r.setText(charSequence);
                                oyVar.U.r.setSelection(charSequence.length());
                            }
                            c8Var2.dismiss();
                            break;
                        }
                    }
                    org.telegram.ui.oy oyVar2 = new org.telegram.ui.oy(null);
                    oyVar2.k2 = charSequence;
                    oyVar2.x = 3;
                    launchActivity.q0(oyVar2, false, false);
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
                o70 o70Var = bdVar.U0;
                if (o70Var == null || !o70Var.D()) {
                    bdVar.a1.e(true);
                    o70 F = o70.F(frameLayout, new nh.b(), bdVar.S0);
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
                xk xkVar = (xk) obj2;
                zk zkVar = (zk) obj;
                al alVar = xkVar.b;
                li liVar = alVar.b;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) liVar.c0;
                if (xnVar.c()) {
                    parentActivity = alVar.getParentActivity();
                    z4.M(parentActivity, xnVar.a(), new o1(11, xkVar, zkVar), alVar.a);
                    break;
                } else {
                    z4.a0(liVar.G1, liVar.j1() + 1, liVar.n1(), new vk(i15, xkVar, zkVar));
                    break;
                }
            case 8:
                qn qnVar = ((on) obj2).d;
                jb1 jb1Var = qnVar.s;
                View F2 = jb1Var.F((nn) obj);
                f2.l1 T2 = F2 != null ? jb1Var.T(F2) : null;
                if (T2 != null && (b10 = T2.b() - qnVar.q0) >= 0 && b10 < qnVar.H.length) {
                    qn.O(qnVar, b10);
                    break;
                }
                break;
            case 9:
                zn znVar = (zn) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                org.telegram.ui.xn xnVar2 = znVar.D;
                if (znVar.Q) {
                    xnVar2.showDialog(z4.V(znVar.getContext(), xnVar2.h, f6Var).a);
                    break;
                } else {
                    vn vnVar = znVar.e;
                    if (xnVar2.getParentActivity() != null) {
                        TLRPC.Chat chat = xnVar2.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = xnVar2.W7;
                            TLRPC.UserFull userFull = xnVar2.X7;
                            int i18 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            h8 h8Var = new h8(znVar.getContext(), null, new wn(znVar, r3), true, 0, znVar.a0);
                            h8Var.b(i18);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h8Var.a;
                            xn xnVar3 = new xn(znVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.p1[] p1VarArr = {xnVar3};
                            xnVar3.e = true;
                            xnVar3.c = 220;
                            xnVar3.setOutsideTouchable(true);
                            p1VarArr[0].setClippingEnabled(true);
                            p1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            p1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            p1VarArr[0].setInputMethodMode(2);
                            p1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            p1VarArr[0].showAtLocation(vnVar, 0, (int) (znVar.getX() + vnVar.getX()), (int) vnVar.getY());
                            xnVar2.g8(false, true, 0.2f);
                            break;
                        } else if (znVar.a.f && xnVar2.getParentActivity() != null && xnVar2.fragmentView != null && xnVar2.W7 != null) {
                            if (xnVar2.l2 == null) {
                                k40 k40Var = new k40(7, xnVar2.getParentActivity(), xnVar2.ba, true);
                                xnVar2.l2 = k40Var;
                                k40Var.setAlpha(0.0f);
                                xnVar2.l2.setVisibility(4);
                                xnVar2.l2.setShowingDuration(4000L);
                                xnVar2.U0.addView(xnVar2.l2, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
                kp.n((kp) obj2, (org.telegram.ui.xn) obj);
                break;
            case 11:
                jr.P((jr) obj2, (TLRPC.Peer) obj);
                break;
            case 12:
                sr srVar = (sr) obj2;
                String str = (String) obj;
                if (srVar.b == null && (view2 = srVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        srVar.b = (EditText) findFocus;
                    }
                }
                if (srVar.b != null) {
                    try {
                        srVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = srVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = srVar.b.getText();
                    int length2 = srVar.b.getSelectionEnd() == srVar.b.length() ? -1 : str.length() + srVar.b.getSelectionStart();
                    if (srVar.b.getSelectionStart() == -1 || srVar.b.getSelectionEnd() == -1) {
                        srVar.b.setText(str);
                        EditText editText2 = srVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = srVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), srVar.b.getSelectionEnd(), str));
                        EditText editText4 = srVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = srVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 13:
                es esVar = (es) obj2;
                ds dsVar = (ds) obj;
                esVar.I();
                dsVar.f = !dsVar.f;
                dsVar.j.U.N(true);
                esVar.s();
                break;
            case 14:
                ((es) obj2).y0 = !r14.y0;
                ((w51) obj).N(true);
                break;
            case 15:
                ((bt) obj2).dismiss();
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new org.telegram.ui.b7());
                break;
            case 16:
                mv.o((mv) obj2, (u5) obj);
                break;
            case 17:
                bz bzVar = (bz) obj2;
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) obj;
                kz kzVar = bzVar.v;
                pw pwVar = kzVar.A0;
                if (pwVar.indexOfChild(m8Var) != -1 && (T = pwVar.T(m8Var)) != null) {
                    if (T.b() == kzVar.c1) {
                        if (kzVar.e1 != null) {
                            ky kyVar = kzVar.q1;
                            if (kyVar != null) {
                                kyVar.y(kzVar.G1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(kzVar.Z0).edit();
                            String str2 = "group_hide_stickers_" + kzVar.G1.id;
                            TLRPC.StickerSet stickerSet = kzVar.G1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            kzVar.Z(false);
                            bz bzVar2 = kzVar.v0;
                            if (bzVar2 != null) {
                                bzVar2.l();
                                break;
                            }
                        }
                    } else if (bzVar.h.get(T.b()) == kzVar.g1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bzVar.c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new fv(bzVar, i14));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        d2Var.show();
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
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
                c20 c20Var = (c20) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = c20Var.C.indexOf(v0Var.getFilter());
                if (c20Var.F != indexOf) {
                    c20Var.F = indexOf;
                    c20Var.f();
                    break;
                } else if (v0Var.getFilter().h) {
                    if (v0Var.a.f) {
                        tf.e0 filter = v0Var.getFilter();
                        c20Var.g(filter);
                        b20 b20Var = c20Var.E;
                        if (b20Var != null) {
                            ((org.telegram.ui.tx) b20Var).d(filter);
                            break;
                        }
                    } else {
                        v0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 20:
                ((v2) obj).run(Long.valueOf(((h20) obj2).d));
                break;
            case 21:
                ((org.telegram.ui.zp) obj).run();
                ((y30) obj2).dismiss();
                break;
            case 22:
                ((o70) obj2).u();
                ((org.telegram.ui.hv0) obj).run();
                break;
            case 23:
                o70 o70Var2 = (o70) obj2;
                ((org.telegram.ui.pv) obj).run();
                if (o70Var2.J) {
                    o70Var2.u();
                    break;
                }
                break;
            case 24:
                y70.m((y70) obj2, (w70) obj);
                break;
            case 25:
                se0.m((se0) obj2, (org.telegram.ui.ActionBar.f6) obj);
                break;
            case 26:
                li0 li0Var = (li0) obj2;
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) obj;
                if (li0Var.G.getTag() == null) {
                    int max = (int) Math.max(1.0f, li0Var.getValue());
                    org.telegram.ui.ad0 ad0Var = (org.telegram.ui.ad0) qsVar.b;
                    TLRPC.User user = (TLRPC.User) qsVar.c;
                    if (ad0Var.getLocationController().getSharingLocationInfo(ad0Var.b0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ad0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                        d2Var2.O = string2;
                        d2Var2.Q = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new e3.d(ad0Var, user, max, i12));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        ad0Var.showDialog(d2Var2);
                    } else {
                        ad0Var.O.I = true;
                        ad0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        ad0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        ad0Var.getLocationController().setProximityLocation(ad0Var.b0, max, true);
                        i15 = 1;
                    }
                    if (i15 != 0) {
                        li0Var.a();
                        break;
                    }
                }
                break;
            case 27:
                qi0 qi0Var = (qi0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(qi0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, qi0Var.getTitleView().getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
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
                lh.l7 l7Var = (lh.l7) obj2;
                l7Var.e = !l7Var.e;
                ((kh.o3) obj).run();
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
