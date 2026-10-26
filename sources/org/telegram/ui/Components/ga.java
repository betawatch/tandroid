package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ga(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity parentActivity;
        int b10;
        View view2;
        s4.e1 T;
        int i10 = this.a;
        int i11 = 2;
        int i12 = -1;
        int i13 = 13;
        int i14 = 3;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ha haVar = (ha) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        qf.d.r(launchActivity, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        qf.d.r(launchActivity, BuildVars.PLAYSTORE_APP_URL);
                        break;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(haVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = haVar.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) haVar.getContext(), haVar.n.document)) {
                            FileLoader.getInstance(haVar.s).loadFile(haVar.n.document, "update", 3, 1);
                            haVar.a(true);
                            break;
                        }
                    } else if (tL_help_appUpdate.url != null) {
                        qf.d.r(haVar.getContext(), haVar.n.url);
                        break;
                    }
                }
                break;
            case 1:
                jd jdVar = (jd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                k80 k80Var = jdVar.X0;
                if (k80Var == null || !k80Var.D()) {
                    jdVar.d1.e(true);
                    k80 F = k80.F(frameLayout, new di.b(), jdVar.V0);
                    jdVar.X0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    jdVar.X0.k();
                    int[] iArr = jdVar.c1;
                    int length = iArr.length;
                    for (int i15 = 0; i15 < length; i15++) {
                        int i16 = iArr[i15];
                        jdVar.X0.c(0, i16 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i16 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i16, new Object[0]), new h2(jdVar, i16, i14), false);
                        if (jdVar.b1 == i16) {
                            jdVar.X0.L();
                        }
                    }
                    jdVar.X0.Z();
                    break;
                } else {
                    jdVar.X0.u();
                    jdVar.X0 = null;
                    break;
                }
                break;
            case 2:
                md mdVar = (md) obj2;
                Runnable runnable = (Runnable) obj;
                if (!mdVar.g) {
                    mdVar.h = runnable;
                    mdVar.dismiss();
                    break;
                }
                break;
            case 3:
                sl.V((sl) obj2, (org.telegram.ui.ActionBar.u6) obj);
                break;
            case 4:
                pl plVar = (pl) obj2;
                rl rlVar = (rl) obj;
                sl slVar = plVar.b;
                ti tiVar = slVar.b;
                org.telegram.ui.un unVar = (org.telegram.ui.un) tiVar.f0;
                if (unVar.c()) {
                    parentActivity = slVar.getParentActivity();
                    g5.L(parentActivity, unVar.a(), new p1(12, plVar, rlVar), slVar.a);
                    break;
                } else {
                    g5.Z(tiVar.M1, tiVar.o1() + 1, tiVar.s1(), new li.s2(28, plVar, rlVar));
                    break;
                }
            case 5:
                go goVar = ((eo) obj2).d;
                org.telegram.ui.za1 za1Var = goVar.s;
                View F2 = za1Var.F((co) obj);
                s4.e1 T2 = F2 != null ? za1Var.T(F2) : null;
                if (T2 != null && (b10 = T2.b() - goVar.t0) >= 0 && b10 < goVar.K.length) {
                    go.R(goVar, b10);
                    break;
                }
                break;
            case 6:
                po poVar = (po) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                org.telegram.ui.un unVar2 = poVar.G;
                if (poVar.T) {
                    unVar2.showDialog(g5.U(poVar.getContext(), unVar2.h, u6Var).a);
                    break;
                } else {
                    lo loVar = poVar.e;
                    if (unVar2.getParentActivity() != null) {
                        TLRPC.Chat chat = unVar2.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = unVar2.l8;
                            TLRPC.UserFull userFull = unVar2.m8;
                            int i17 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            r8 r8Var = new r8(poVar.getContext(), null, new mo(poVar, r5), true, 0, poVar.d0);
                            r8Var.b(i17);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r8Var.a;
                            no noVar = new no(poVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.o1[] o1VarArr = {noVar};
                            noVar.e = true;
                            noVar.c = 220;
                            noVar.setOutsideTouchable(true);
                            o1VarArr[0].setClippingEnabled(true);
                            o1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            o1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            o1VarArr[0].setInputMethodMode(2);
                            o1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            o1VarArr[0].showAtLocation(loVar, 0, (int) (poVar.getX() + loVar.getX()), (int) loVar.getY());
                            unVar2.n8(false, true, 0.2f);
                            break;
                        } else if (poVar.a.f && unVar2.getParentActivity() != null && unVar2.fragmentView != null && unVar2.l8 != null) {
                            if (unVar2.A2 == null) {
                                t40 t40Var = new t40(7, unVar2.getParentActivity(), unVar2.qa, true);
                                unVar2.A2 = t40Var;
                                t40Var.setAlpha(0.0f);
                                unVar2.A2.setVisibility(4);
                                unVar2.A2.setShowingDuration(4000L);
                                unVar2.j1.addView(unVar2.A2, gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i18 = unVar2.l8.ttl_period;
                            unVar2.A2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i18 > 86400 ? LocaleController.formatPluralString("Days", i18 / 86400, new Object[0]) : i18 >= 3600 ? LocaleController.formatPluralString("Hours", i18 / 3600, new Object[0]) : i18 >= 60 ? LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i18, new Object[0])));
                            unVar2.A2.f(unVar2.m1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 7:
                yp.n((yp) obj2, (org.telegram.ui.un) obj);
                break;
            case 8:
                zr.P((zr) obj2, (TLRPC.Peer) obj);
                break;
            case 9:
                hs hsVar = (hs) obj2;
                String str = (String) obj;
                if (hsVar.b == null && (view2 = hsVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        hsVar.b = (EditText) findFocus;
                    }
                }
                if (hsVar.b != null) {
                    try {
                        hsVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = hsVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = hsVar.b.getText();
                    int length2 = hsVar.b.getSelectionEnd() == hsVar.b.length() ? -1 : str.length() + hsVar.b.getSelectionStart();
                    if (hsVar.b.getSelectionStart() == -1 || hsVar.b.getSelectionEnd() == -1) {
                        hsVar.b.setText(str);
                        EditText editText2 = hsVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = hsVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), hsVar.b.getSelectionEnd(), str));
                        EditText editText4 = hsVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = hsVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 10:
                rs rsVar = (rs) obj2;
                qs qsVar = (qs) obj;
                rsVar.J();
                qsVar.f = !qsVar.f;
                qsVar.j.X.O(true);
                rsVar.s();
                break;
            case 11:
                ((rs) obj2).B0 = !r12.B0;
                ((j71) obj).O(true);
                break;
            case 12:
                ((pt) obj2).dismiss();
                ((org.telegram.ui.ActionBar.r2) obj).presentFragment(new org.telegram.ui.c7());
                break;
            case 13:
                aw.o((aw) obj2, (c6) obj);
                break;
            case 14:
                jz jzVar = (jz) obj2;
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) obj;
                sz szVar = jzVar.v;
                zw zwVar = szVar.D0;
                if (zwVar.indexOfChild(s8Var) != -1 && (T = zwVar.T(s8Var)) != null) {
                    if (T.b() == szVar.f1) {
                        if (szVar.h1 != null) {
                            ty tyVar = szVar.t1;
                            if (tyVar != null) {
                                tyVar.y(szVar.J1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(szVar.c1).edit();
                            String str2 = "group_hide_stickers_" + szVar.J1.id;
                            TLRPC.StickerSet stickerSet = szVar.J1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            szVar.X(false);
                            jz jzVar2 = szVar.y0;
                            if (jzVar2 != null) {
                                jzVar2.l();
                                break;
                            }
                        }
                    } else if (jzVar.h.get(T.b()) == szVar.j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new tv(jzVar, i11));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        e2Var.show();
                        TextView textView = (TextView) e2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                            break;
                        }
                    }
                }
                break;
            case 15:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.W0;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.W);
                int i19 = 0;
                while (true) {
                    if (i19 < 3) {
                        if (playbackSpeed - 0.1f <= fArr[i19]) {
                            i12 = i19;
                        } else {
                            i19++;
                        }
                    }
                }
                int i20 = i12 + 1;
                float f7 = fArr[i20 < 3 ? i20 : 0];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.W, f7);
                fragmentContextView.l(playbackSpeed, f7, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.B0 == null && currentTimeMillis - fragmentContextView.D0 > 300) {
                    u40 u40Var = u40.v;
                    if (u40Var.c()) {
                        u40Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.C0 != null) {
                            e20 e20Var = new e20(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.B0 = e20Var;
                            e20Var.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                            fragmentContextView.B0.setText(LocaleController.getString(R.string.SpeedHint));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                            fragmentContextView.C0.addView(fragmentContextView.B0, marginLayoutParams);
                            fragmentContextView.B0.f(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                break;
            case 16:
                m20 m20Var = (m20) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = m20Var.F.indexOf(v0Var.getFilter());
                if (m20Var.I != indexOf) {
                    m20Var.I = indexOf;
                    m20Var.e();
                    break;
                } else if (v0Var.getFilter().h) {
                    if (v0Var.a.f) {
                        ig.p0 filter = v0Var.getFilter();
                        m20Var.f(filter);
                        l20 l20Var = m20Var.H;
                        if (l20Var != null) {
                            ((org.telegram.ui.ix) l20Var).f(filter);
                            break;
                        }
                    } else {
                        v0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 17:
                ((b3) obj).run(Long.valueOf(((r20) obj2).d));
                break;
            case 18:
                ((org.telegram.ui.xp) obj).run();
                ((h40) obj2).dismiss();
                break;
            case 19:
                ((k80) obj2).u();
                ((org.telegram.ui.bc0) obj).run();
                break;
            case 20:
                k80 k80Var2 = (k80) obj2;
                ((org.telegram.ui.gv) obj).run();
                if (k80Var2.J) {
                    k80Var2.u();
                    break;
                }
                break;
            case 21:
                t80.m((t80) obj2, (r80) obj);
                break;
            case 22:
                jf0.m((jf0) obj2, (org.telegram.ui.ActionBar.u6) obj);
                break;
            case 23:
                dj0 dj0Var = (dj0) obj2;
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                if (dj0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, dj0Var.getValue());
                    org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) k1Var.c;
                    TLRPC.User user = (TLRPC.User) k1Var.b;
                    if (pc0Var.getLocationController().getSharingLocationInfo(pc0Var.e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(pc0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                        e2Var2.R = string2;
                        e2Var2.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new i2.z(pc0Var, user, max, i13));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        pc0Var.showDialog(e2Var2);
                    } else {
                        pc0Var.R.L = true;
                        pc0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        pc0Var.n0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        pc0Var.getLocationController().setProximityLocation(pc0Var.e0, max, true);
                        r9 = 1;
                    }
                    if (r9 != 0) {
                        dj0Var.a();
                        break;
                    }
                }
                break;
            case 24:
                ij0 ij0Var = (ij0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(ij0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, ij0Var.getTitleView().getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                break;
            case 25:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                createChooser.setFlags(TLObject.FLAG_28);
                ((Context) obj).startActivity(createChooser);
                break;
            case 26:
                org.telegram.ui.ft.o().t(((yy0) obj2).r.m0);
                org.telegram.ui.ft.o().w((org.telegram.ui.Cells.i8) obj);
                break;
            case 27:
                AndroidUtilities.addToClipboard((CharSequence) obj2);
                ((Runnable) obj).run();
                break;
            case 28:
                boolean[] zArr = (boolean[]) obj;
                ((org.telegram.ui.ActionBar.k3) obj2).dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                r51 r51Var = (r51) obj2;
                r51Var.k0 = false;
                r51Var.J();
                ((j71) obj).O(true);
                r51Var.s();
                break;
        }
    }
}
