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
import org.telegram.ui.rb1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                ((p70) obj).u();
                c8Var.t0(7);
                break;
            case 3:
                u90 u90Var = (u90) obj;
                c8 c8Var2 = ((t7) obj2).C;
                i10 = ((org.telegram.ui.ActionBar.g3) c8Var2).currentAccount;
                LaunchActivity launchActivity = c8Var2.D0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(u90Var.getText().toString())) {
                    String charSequence = u90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof org.telegram.ui.qy) {
                        org.telegram.ui.qy qyVar = (org.telegram.ui.qy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = qyVar.getMessagesController().getTotalDialogsCount();
                        if (!qyVar.i2 && (totalDialogsCount > 10 || qyVar.H)) {
                            if (qyVar.g2) {
                                qyVar.U.r.setText(charSequence);
                                qyVar.U.r.setSelection(charSequence.length());
                                org.telegram.ui.zx zxVar = qyVar.z0;
                                if (zxVar != null && (L = zxVar.L(3)) >= 0 && qyVar.z0.getTabsView().getCurrentTabId() != L) {
                                    qyVar.z0.getTabsView().d(L, L);
                                }
                            } else {
                                qyVar.x = 3;
                                qyVar.U.r.setText(charSequence);
                                qyVar.U.r.setSelection(charSequence.length());
                            }
                            c8Var2.dismiss();
                            break;
                        }
                    }
                    org.telegram.ui.qy qyVar2 = new org.telegram.ui.qy(null);
                    qyVar2.k2 = charSequence;
                    qyVar2.x = 3;
                    launchActivity.q0(qyVar2, false, false);
                    c8Var2.dismiss();
                    break;
                }
                break;
            case 4:
                w8 w8Var = (w8) obj;
                ((boolean[]) obj2)[0] = true;
                w8Var.G.v1(w8Var.V);
                w8Var.P.dismiss();
                break;
            case 5:
                v9 v9Var = (v9) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        ze.d.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        ze.d.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
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
                        ze.d.s(v9Var.getContext(), v9Var.n.url);
                        break;
                    }
                }
                break;
            case 6:
                bd bdVar = (bd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                p70 p70Var = bdVar.U0;
                if (p70Var == null || !p70Var.D()) {
                    bdVar.a1.e(true);
                    p70 F = p70.F(frameLayout, new nh.b(), bdVar.S0);
                    bdVar.U0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    bdVar.U0.k();
                    int[] iArr = bdVar.Z0;
                    int length = iArr.length;
                    for (int i16 = 0; i16 < length; i16++) {
                        int i17 = iArr[i16];
                        bdVar.U0.c(0, i17 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i17 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i17, new Object[0]), new ah.b(bdVar, i17, 27), false);
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
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) liVar.c0;
                if (znVar.c()) {
                    parentActivity = alVar.getParentActivity();
                    z4.M(parentActivity, znVar.a(), new o1(11, xkVar, zkVar), alVar.a);
                    break;
                } else {
                    z4.a0(liVar.G1, liVar.j1() + 1, liVar.n1(), new vk(i15, xkVar, zkVar));
                    break;
                }
            case 8:
                pn pnVar = ((nn) obj2).d;
                rb1 rb1Var = pnVar.s;
                View F2 = rb1Var.F((mn) obj);
                f2.l1 T2 = F2 != null ? rb1Var.T(F2) : null;
                if (T2 != null && (b10 = T2.b() - pnVar.q0) >= 0 && b10 < pnVar.H.length) {
                    pn.O(pnVar, b10);
                    break;
                }
                break;
            case 9:
                yn ynVar = (yn) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                org.telegram.ui.zn znVar2 = ynVar.D;
                if (ynVar.Q) {
                    znVar2.showDialog(z4.V(ynVar.getContext(), znVar2.h, f6Var).a);
                    break;
                } else {
                    un unVar = ynVar.e;
                    if (znVar2.getParentActivity() != null) {
                        TLRPC.Chat chat = znVar2.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = znVar2.W7;
                            TLRPC.UserFull userFull = znVar2.X7;
                            int i18 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            h8 h8Var = new h8(ynVar.getContext(), null, new vn(ynVar, r3), true, 0, ynVar.a0);
                            h8Var.b(i18);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h8Var.a;
                            wn wnVar = new wn(ynVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.p1[] p1VarArr = {wnVar};
                            wnVar.e = true;
                            wnVar.c = 220;
                            wnVar.setOutsideTouchable(true);
                            p1VarArr[0].setClippingEnabled(true);
                            p1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            p1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            p1VarArr[0].setInputMethodMode(2);
                            p1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            p1VarArr[0].showAtLocation(unVar, 0, (int) (ynVar.getX() + unVar.getX()), (int) unVar.getY());
                            znVar2.g8(false, true, 0.2f);
                            break;
                        } else if (ynVar.a.f && znVar2.getParentActivity() != null && znVar2.fragmentView != null && znVar2.W7 != null) {
                            if (znVar2.l2 == null) {
                                l40 l40Var = new l40(7, znVar2.getParentActivity(), znVar2.ba, true);
                                znVar2.l2 = l40Var;
                                l40Var.setAlpha(0.0f);
                                znVar2.l2.setVisibility(4);
                                znVar2.l2.setShowingDuration(4000L);
                                znVar2.U0.addView(znVar2.l2, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i19 = znVar2.W7.ttl_period;
                            znVar2.l2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i19 > 86400 ? LocaleController.formatPluralString("Days", i19 / 86400, new Object[0]) : i19 >= 3600 ? LocaleController.formatPluralString("Hours", i19 / 3600, new Object[0]) : i19 >= 60 ? LocaleController.formatPluralString("Minutes", i19 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i19, new Object[0])));
                            znVar2.l2.f(znVar2.X0.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 10:
                jp.n((jp) obj2, (org.telegram.ui.zn) obj);
                break;
            case 11:
                ir.P((ir) obj2, (TLRPC.Peer) obj);
                break;
            case 12:
                rr rrVar = (rr) obj2;
                String str = (String) obj;
                if (rrVar.b == null && (view2 = rrVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        rrVar.b = (EditText) findFocus;
                    }
                }
                if (rrVar.b != null) {
                    try {
                        rrVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = rrVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = rrVar.b.getText();
                    int length2 = rrVar.b.getSelectionEnd() == rrVar.b.length() ? -1 : str.length() + rrVar.b.getSelectionStart();
                    if (rrVar.b.getSelectionStart() == -1 || rrVar.b.getSelectionEnd() == -1) {
                        rrVar.b.setText(str);
                        EditText editText2 = rrVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = rrVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), rrVar.b.getSelectionEnd(), str));
                        EditText editText4 = rrVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = rrVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 13:
                ds dsVar = (ds) obj2;
                cs csVar = (cs) obj;
                dsVar.I();
                csVar.f = !csVar.f;
                csVar.j.U.N(true);
                dsVar.s();
                break;
            case 14:
                ((ds) obj2).y0 = !r14.y0;
                ((w51) obj).N(true);
                break;
            case 15:
                ((at) obj2).dismiss();
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new org.telegram.ui.d7());
                break;
            case 16:
                lv.o((lv) obj2, (u5) obj);
                break;
            case 17:
                bz bzVar = (bz) obj2;
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) obj;
                kz kzVar = bzVar.v;
                pw pwVar = kzVar.A0;
                if (pwVar.indexOfChild(l8Var) != -1 && (T = pwVar.T(l8Var)) != null) {
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
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ev(bzVar, i14));
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
                        org.telegram.ui.gj gjVar = new org.telegram.ui.gj(6, 2, fragmentContextView.getContext(), null, true);
                        fragmentContextView.x0 = gjVar;
                        gjVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
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
                        tf.e0 filter = v0Var.getFilter();
                        d20Var.g(filter);
                        c20 c20Var = d20Var.E;
                        if (c20Var != null) {
                            ((org.telegram.ui.vx) c20Var).d(filter);
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
                ((org.telegram.ui.bq) obj).run();
                ((z30) obj2).dismiss();
                break;
            case 22:
                ((p70) obj2).u();
                ((org.telegram.ui.ov0) obj).run();
                break;
            case 23:
                p70 p70Var2 = (p70) obj2;
                ((org.telegram.ui.rv) obj).run();
                if (p70Var2.J) {
                    p70Var2.u();
                    break;
                }
                break;
            case 24:
                z70.m((z70) obj2, (x70) obj);
                break;
            case 25:
                te0.m((te0) obj2, (org.telegram.ui.ActionBar.f6) obj);
                break;
            case 26:
                mi0 mi0Var = (mi0) obj2;
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) obj;
                if (mi0Var.G.getTag() == null) {
                    int max = (int) Math.max(1.0f, mi0Var.getValue());
                    org.telegram.ui.cd0 cd0Var = (org.telegram.ui.cd0) ssVar.b;
                    TLRPC.User user = (TLRPC.User) ssVar.c;
                    if (cd0Var.getLocationController().getSharingLocationInfo(cd0Var.b0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cd0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                        d2Var2.O = string2;
                        d2Var2.Q = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new e3.d(cd0Var, user, max, i12));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        cd0Var.showDialog(d2Var2);
                    } else {
                        cd0Var.O.I = true;
                        cd0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        cd0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        cd0Var.getLocationController().setProximityLocation(cd0Var.b0, max, true);
                        i15 = 1;
                    }
                    if (i15 != 0) {
                        mi0Var.a();
                        break;
                    }
                }
                break;
            case 27:
                ri0 ri0Var = (ri0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(ri0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, ri0Var.getTitleView().getText()), 500);
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
                ((kh.n3) obj).run();
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
