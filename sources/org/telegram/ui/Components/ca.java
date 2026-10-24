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
import org.telegram.ui.xa1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ca(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity parentActivity;
        int b10;
        View view2;
        s4.b1 T;
        int i10 = this.a;
        int i11 = 2;
        int i12 = -1;
        int i13 = 13;
        int i14 = 3;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                da daVar = (da) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        pf.d.r(launchActivity, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        pf.d.r(launchActivity, BuildVars.PLAYSTORE_APP_URL);
                        break;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(daVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = daVar.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) daVar.getContext(), daVar.n.document)) {
                            FileLoader.getInstance(daVar.s).loadFile(daVar.n.document, "update", 3, 1);
                            daVar.a(true);
                            break;
                        }
                    } else if (tL_help_appUpdate.url != null) {
                        pf.d.r(daVar.getContext(), daVar.n.url);
                        break;
                    }
                }
                break;
            case 1:
                kd kdVar = (kd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                j80 j80Var = kdVar.X0;
                if (j80Var == null || !j80Var.D()) {
                    kdVar.d1.e(true);
                    j80 F = j80.F(frameLayout, new ci.b(), kdVar.V0);
                    kdVar.X0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    kdVar.X0.k();
                    int[] iArr = kdVar.c1;
                    int length = iArr.length;
                    for (int i15 = 0; i15 < length; i15++) {
                        int i16 = iArr[i15];
                        kdVar.X0.c(0, i16 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i16 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i16, new Object[0]), new d2(kdVar, i16, i14), false);
                        if (kdVar.b1 == i16) {
                            kdVar.X0.L();
                        }
                    }
                    kdVar.X0.Z();
                    break;
                } else {
                    kdVar.X0.u();
                    kdVar.X0 = null;
                    break;
                }
                break;
            case 2:
                rl.V((rl) obj2, (org.telegram.ui.ActionBar.g6) obj);
                break;
            case 3:
                ol olVar = (ol) obj2;
                ql qlVar = (ql) obj;
                rl rlVar = olVar.b;
                ti tiVar = rlVar.b;
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) tiVar.f0;
                if (snVar.c()) {
                    parentActivity = rlVar.getParentActivity();
                    f5.M(parentActivity, snVar.a(), new p2(9, olVar, qlVar), rlVar.a);
                    break;
                } else {
                    f5.a0(tiVar.M1, tiVar.o1() + 1, tiVar.s1(), new org.telegram.ui.ActionBar.m3(26, olVar, qlVar));
                    break;
                }
            case 4:
                fo foVar = ((co) obj2).d;
                xa1 xa1Var = foVar.s;
                View F2 = xa1Var.F((bo) obj);
                s4.b1 T2 = F2 != null ? xa1Var.T(F2) : null;
                if (T2 != null && (b10 = T2.b() - foVar.t0) >= 0 && b10 < foVar.K.length) {
                    fo.R(foVar, b10);
                    break;
                }
                break;
            case 5:
                oo ooVar = (oo) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                org.telegram.ui.sn snVar2 = ooVar.G;
                if (ooVar.T) {
                    snVar2.showDialog(f5.V(ooVar.getContext(), snVar2.h, g6Var).a);
                    break;
                } else {
                    ko koVar = ooVar.e;
                    if (snVar2.getParentActivity() != null) {
                        TLRPC.Chat chat = snVar2.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = snVar2.l8;
                            TLRPC.UserFull userFull = snVar2.m8;
                            int i17 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            p8 p8Var = new p8(ooVar.getContext(), null, new lo(ooVar, r5), true, 0, ooVar.d0);
                            p8Var.b(i17);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p8Var.a;
                            mo moVar = new mo(ooVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.m1[] m1VarArr = {moVar};
                            moVar.e = true;
                            moVar.c = 220;
                            moVar.setOutsideTouchable(true);
                            m1VarArr[0].setClippingEnabled(true);
                            m1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            m1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            m1VarArr[0].setInputMethodMode(2);
                            m1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            m1VarArr[0].showAtLocation(koVar, 0, (int) (ooVar.getX() + koVar.getX()), (int) koVar.getY());
                            snVar2.j8(false, true, 0.2f);
                            break;
                        } else if (ooVar.a.f && snVar2.getParentActivity() != null && snVar2.fragmentView != null && snVar2.l8 != null) {
                            if (snVar2.A2 == null) {
                                r40 r40Var = new r40(7, snVar2.getParentActivity(), snVar2.qa, true);
                                snVar2.A2 = r40Var;
                                r40Var.setAlpha(0.0f);
                                snVar2.A2.setVisibility(4);
                                snVar2.A2.setShowingDuration(4000L);
                                snVar2.j1.addView(snVar2.A2, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i18 = snVar2.l8.ttl_period;
                            snVar2.A2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i18 > 86400 ? LocaleController.formatPluralString("Days", i18 / 86400, new Object[0]) : i18 >= 3600 ? LocaleController.formatPluralString("Hours", i18 / 3600, new Object[0]) : i18 >= 60 ? LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i18, new Object[0])));
                            snVar2.A2.f(snVar2.m1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 6:
                wp.n((wp) obj2, (org.telegram.ui.sn) obj);
                break;
            case 7:
                xr.P((xr) obj2, (TLRPC.Peer) obj);
                break;
            case 8:
                fs fsVar = (fs) obj2;
                String str = (String) obj;
                if (fsVar.b == null && (view2 = fsVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        fsVar.b = (EditText) findFocus;
                    }
                }
                if (fsVar.b != null) {
                    try {
                        fsVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = fsVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = fsVar.b.getText();
                    int length2 = fsVar.b.getSelectionEnd() == fsVar.b.length() ? -1 : str.length() + fsVar.b.getSelectionStart();
                    if (fsVar.b.getSelectionStart() == -1 || fsVar.b.getSelectionEnd() == -1) {
                        fsVar.b.setText(str);
                        EditText editText2 = fsVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = fsVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), fsVar.b.getSelectionEnd(), str));
                        EditText editText4 = fsVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = fsVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 9:
                ps psVar = (ps) obj2;
                os osVar = (os) obj;
                psVar.J();
                osVar.f = !osVar.f;
                osVar.j.X.N(true);
                psVar.t();
                break;
            case 10:
                ((ps) obj2).B0 = !r12.B0;
                ((b71) obj).N(true);
                break;
            case 11:
                ((nt) obj2).dismiss();
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new org.telegram.ui.c7());
                break;
            case 12:
                aw.p((aw) obj2, (a6) obj);
                break;
            case 13:
                kz kzVar = (kz) obj2;
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) obj;
                tz tzVar = kzVar.v;
                ax axVar = tzVar.D0;
                if (axVar.indexOfChild(o8Var) != -1 && (T = axVar.T(o8Var)) != null) {
                    if (T.b() == tzVar.f1) {
                        if (tzVar.h1 != null) {
                            uy uyVar = tzVar.t1;
                            if (uyVar != null) {
                                uyVar.y(tzVar.J1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(tzVar.c1).edit();
                            String str2 = "group_hide_stickers_" + tzVar.J1.id;
                            TLRPC.StickerSet stickerSet = tzVar.J1.stickerset;
                            edit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            tzVar.X(false);
                            kz kzVar2 = tzVar.y0;
                            if (kzVar2 != null) {
                                kzVar2.l();
                                break;
                            }
                        }
                    } else if (kzVar.h.get(T.b()) == tzVar.j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string;
                        c2Var.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new tv(kzVar, i11));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        c2Var.show();
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
                            break;
                        }
                    }
                }
                break;
            case 14:
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
                    s40 s40Var = s40.v;
                    if (s40Var.c()) {
                        s40Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.C0 != null) {
                            c20 c20Var = new c20(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.B0 = c20Var;
                            c20Var.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
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
            case 15:
                k20 k20Var = (k20) obj2;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) obj;
                int indexOf = k20Var.F.indexOf(t0Var.getFilter());
                if (k20Var.I != indexOf) {
                    k20Var.I = indexOf;
                    k20Var.e();
                    break;
                } else if (t0Var.getFilter().h) {
                    if (t0Var.a.f) {
                        hg.o0 filter = t0Var.getFilter();
                        k20Var.f(filter);
                        j20 j20Var = k20Var.H;
                        if (j20Var != null) {
                            ((org.telegram.ui.jx) j20Var).f(filter);
                            break;
                        }
                    } else {
                        t0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 16:
                ((y2) obj).run(Long.valueOf(((p20) obj2).d));
                break;
            case 17:
                ((org.telegram.ui.tp) obj).run();
                ((f40) obj2).dismiss();
                break;
            case 18:
                ((j80) obj2).u();
                ((org.telegram.ui.ec0) obj).run();
                break;
            case 19:
                j80 j80Var2 = (j80) obj2;
                ((org.telegram.ui.hv) obj).run();
                if (j80Var2.J) {
                    j80Var2.u();
                    break;
                }
                break;
            case 20:
                s80.m((s80) obj2, (q80) obj);
                break;
            case 21:
                mf0.m((mf0) obj2, (org.telegram.ui.ActionBar.g6) obj);
                break;
            case 22:
                ej0 ej0Var = (ej0) obj2;
                org.telegram.ui.ks ksVar = (org.telegram.ui.ks) obj;
                if (ej0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, ej0Var.getValue());
                    org.telegram.ui.sc0 sc0Var = (org.telegram.ui.sc0) ksVar.b;
                    TLRPC.User user = (TLRPC.User) ksVar.c;
                    if (sc0Var.getLocationController().getSharingLocationInfo(sc0Var.e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sc0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                        c2Var2.R = string2;
                        c2Var2.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new hg.b2(sc0Var, user, max, i13));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        sc0Var.showDialog(c2Var2);
                    } else {
                        sc0Var.R.L = true;
                        sc0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        sc0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        sc0Var.getLocationController().setProximityLocation(sc0Var.e0, max, true);
                        r9 = 1;
                    }
                    if (r9 != 0) {
                        ej0Var.a();
                        break;
                    }
                }
                break;
            case 23:
                jj0 jj0Var = (jj0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(jj0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, jj0Var.getTitleView().getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                break;
            case 24:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                createChooser.setFlags(TLObject.FLAG_28);
                ((Context) obj).startActivity(createChooser);
                break;
            case 25:
                ai.y9 y9Var = (ai.y9) obj2;
                y9Var.e = !y9Var.e;
                ((org.telegram.messenger.xj) obj).run();
                y9Var.j(true);
                break;
            case 26:
                org.telegram.ui.ht.o().t(((py0) obj2).r.m0);
                org.telegram.ui.ht.o().w((org.telegram.ui.Cells.e8) obj);
                break;
            case 27:
                AndroidUtilities.addToClipboard((CharSequence) obj2);
                ((Runnable) obj).run();
                break;
            case 28:
                boolean[] zArr = (boolean[]) obj;
                ((org.telegram.ui.ActionBar.h3) obj2).dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                k51 k51Var = (k51) obj2;
                k51Var.k0 = false;
                k51Var.J();
                ((b71) obj).N(true);
                k51Var.t();
                break;
        }
    }
}
