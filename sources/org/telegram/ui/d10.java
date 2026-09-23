package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class d10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d10(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        y70 y70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                u10 u10Var = (u10) obj;
                AndroidUtilities.cancelRunOnUIThread(u10Var.n0);
                u10Var.a.a(false, true);
                break;
            case 1:
                u10 u10Var2 = ((j10) obj).a;
                u10Var2.h(u10Var2.E, u10Var2.F, u10Var2.H, u10Var2.G, u10Var2.y, u10Var2.J, u10Var2.w, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((ai.w0) obj).Y2).getMessagesController().lockFiltersInternal();
                break;
            case 3:
                x10 x10Var = (x10) obj;
                x10Var.s.a();
                x10Var.n.invalidate();
                x10Var.E.Z(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((e20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i13 = 0; i13 < dialogFilters.size(); i13++) {
                        if (dialogFilters.get(i13).isDefault() && i13 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                            ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                            if (i13 < 0 || i13 >= arrayList.size()) {
                                i10 = 1;
                            } else {
                                arrayList.add(0, arrayList.remove(i13));
                                for (int i14 = 0; i14 <= i13; i14++) {
                                    arrayList.get(i14).order = i14;
                                }
                                i10 = 1;
                                filtersSetupActivity2.e = true;
                                filtersSetupActivity2.Z(true);
                            }
                            filtersSetupActivity.a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(filtersSetupActivity);
                            int i15 = R.raw.filter_reorder;
                            int i16 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new v10(filtersSetupActivity, i12)).j();
                            break;
                        }
                    }
                    break;
                }
                break;
            case 5:
                f60 f60Var = ((n30) obj).b;
                f60Var.j2 = null;
                f60Var.J1(f60Var.F1, true);
                break;
            case 6:
                m50 m50Var = (m50) obj;
                f60 f60Var2 = m50Var.f;
                z30 z30Var = f60Var2.b;
                ImageLocation imageLocation = m50Var.d;
                if (imageLocation != null) {
                    z30Var.K0 = imageLocation;
                    z30Var.q1 = null;
                    z30Var.r1 = null;
                    m50Var.d = null;
                }
                TLRPC.Chat chat = f60Var2.d.getMessagesController().getChat(Long.valueOf(-m50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(m50Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(m50Var.c);
                }
                z30Var.setCreateThumbFromParent(false);
                z30Var.H(null, forChat, forChat2, true);
                m50Var.c = null;
                m50Var.b = null;
                AndroidUtilities.updateVisibleRows(f60Var2.Q);
                m50Var.a(1.0f);
                break;
            case 7:
                p50 p50Var = ((q50) obj).g;
                if (p50Var != null) {
                    p50Var.invalidate();
                    break;
                }
                break;
            case 8:
                i70 i70Var = (i70) obj;
                i70Var.y = null;
                i70Var.E = null;
                i70Var.F = null;
                i70Var.G = null;
                i70Var.I = null;
                i70Var.H = null;
                i70Var.J = 0.0d;
                i70Var.Z(false, true);
                i70Var.d.h(null, null, i70Var.r, null);
                i70Var.f.setAnimation(i70Var.R);
                i70Var.R.M(0);
                break;
            case 9:
                org.telegram.messenger.z0.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(((l70) obj).c), R.raw.done, 36);
                break;
            case 10:
                a80 a80Var = (a80) obj;
                y70 y70Var2 = a80Var.I;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.h6.d6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, i18, false);
                int i19 = y70.y;
                y70Var2.b(i17, 17, w02, true);
                int[] iArr = a80Var.I.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                y70 y70Var3 = a80Var.I;
                y70Var3.c(y70Var3.v, 23, true);
                int[] iArr2 = a80Var.I.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i18, false));
                break;
            case 11:
                w70 w70Var = (w70) obj;
                w70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                a80 a80Var2 = (a80) w70Var.b;
                Intro.setPage(a80Var2.H);
                Intro.setDate((currentTimeMillis - a80Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                y70 y70Var4 = a80Var2.I;
                if (y70Var4 != null && y70Var4.isAlive() && (eGLDisplay = (y70Var = a80Var2.I).c) != null && (eGLSurface = y70Var.f) != null) {
                    try {
                        y70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                a80 a80Var3 = ((x70) obj).b;
                a80Var3.presentFragment(new rg0(), true);
                a80Var3.M = true;
                break;
            case 13:
                ((y70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 14:
                ((nf.e) obj).b();
                break;
            case 15:
                ((sa0) obj).a.C0.setVisibility(8);
                break;
            case 16:
                ((yb0) obj).g0();
                break;
            case 17:
                try {
                    org.telegram.ui.Components.ml0 currentListView = ((bd0) obj).y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((he0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 19:
                ke0 ke0Var = (ke0) obj;
                org.telegram.ui.Components.bj0 bj0Var = ke0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = ke0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    rg0.T0(ke0Var.y, editTextBoldCursor2);
                    bj0Var.getAnimatedDrawable().N(0, false, false);
                    bj0Var.d();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.bj0) obj).d();
                break;
            case 21:
                ((se0) ((ci.h2) obj).c).getClass();
                break;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                se0 se0Var = ((re0) obj).a;
                double d = se0Var.Q;
                sf0 sf0Var = se0Var.v;
                se0Var.Q = currentTimeMillis2;
                int i20 = (int) (se0Var.P - (currentTimeMillis2 - d));
                se0Var.P = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    sf0Var.setTextSize(1, 13.0f);
                    int i24 = se0Var.E;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            sf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        sf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    se0Var.r();
                    int i25 = se0Var.E;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        sf0Var.setTextSize(1, 15.0f);
                        int i26 = se0Var.E;
                        if (i26 == 4) {
                            sf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            sf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            sf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            sf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.h6.P9;
                        sf0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i27, false));
                        sf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                uf0 uf0Var = (uf0) ((ci.o2) obj).b;
                double d10 = currentTimeMillis3 - uf0Var.b0;
                uf0Var.b0 = currentTimeMillis3;
                int i28 = (int) (uf0Var.W - d10);
                uf0Var.W = i28;
                if (i28 <= 1000) {
                    uf0Var.setProblemTextVisible(true);
                    uf0Var.v.setVisibility(8);
                    sf0 sf0Var2 = uf0Var.x;
                    if (sf0Var2 != null) {
                        sf0Var2.setVisibility(0);
                    }
                    uf0Var.v();
                    break;
                }
                break;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                uf0 uf0Var2 = ((tf0) obj).a;
                double d11 = uf0Var2.a0;
                sf0 sf0Var3 = uf0Var2.v;
                uf0Var2.a0 = currentTimeMillis4;
                int i29 = (int) (uf0Var2.V - (currentTimeMillis4 - d11));
                uf0Var2.V = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = uf0Var2.g0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (uf0Var2.f0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                sf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            sf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        sf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    uf0Var2.w();
                    int i34 = uf0Var2.g0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            sf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            sf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            sf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.h6.P9;
                        sf0Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i35, false));
                        sf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 25:
                ((org.telegram.ui.Components.jn0) obj).run();
                break;
            case 26:
                ((bh0) obj).setSkipDrawSelector(false);
                break;
            case 27:
                ((org.telegram.ui.Components.vi) obj).setVisibility(8);
                break;
            case 28:
                AndroidUtilities.showKeyboard(((wj0) ((g) obj).b).Q);
                break;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
        }
    }
}
