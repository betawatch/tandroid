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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class g10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g10(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        b80 b80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                x10 x10Var = (x10) obj;
                AndroidUtilities.cancelRunOnUIThread(x10Var.n0);
                x10Var.a.a(false, true);
                break;
            case 1:
                x10 x10Var2 = ((m10) obj).a;
                x10Var2.h(x10Var2.E, x10Var2.F, x10Var2.H, x10Var2.G, x10Var2.y, x10Var2.J, x10Var2.w, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((ai.w0) obj).Y2).getMessagesController().lockFiltersInternal();
                break;
            case 3:
                a20 a20Var = (a20) obj;
                a20Var.s.a();
                a20Var.n.invalidate();
                a20Var.E.Z(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((h20) obj).d;
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
                            filtersSetupActivity.a.v0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(filtersSetupActivity);
                            int i15 = R.raw.filter_reorder;
                            int i16 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new y10(filtersSetupActivity, i12)).j();
                            break;
                        }
                    }
                    break;
                }
                break;
            case 5:
                i60 i60Var = ((q30) obj).b;
                i60Var.j2 = null;
                i60Var.J1(i60Var.F1, true);
                break;
            case 6:
                p50 p50Var = (p50) obj;
                i60 i60Var2 = p50Var.f;
                c40 c40Var = i60Var2.b;
                ImageLocation imageLocation = p50Var.d;
                if (imageLocation != null) {
                    c40Var.K0 = imageLocation;
                    c40Var.q1 = null;
                    c40Var.r1 = null;
                    p50Var.d = null;
                }
                TLRPC.Chat chat = i60Var2.d.getMessagesController().getChat(Long.valueOf(-p50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(p50Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(p50Var.c);
                }
                c40Var.setCreateThumbFromParent(false);
                c40Var.H(null, forChat, forChat2, true);
                p50Var.c = null;
                p50Var.b = null;
                AndroidUtilities.updateVisibleRows(i60Var2.Q);
                p50Var.a(1.0f);
                break;
            case 7:
                s50 s50Var = ((t50) obj).g;
                if (s50Var != null) {
                    s50Var.invalidate();
                    break;
                }
                break;
            case 8:
                l70 l70Var = (l70) obj;
                l70Var.y = null;
                l70Var.E = null;
                l70Var.F = null;
                l70Var.G = null;
                l70Var.I = null;
                l70Var.H = null;
                l70Var.J = 0.0d;
                l70Var.Z(false, true);
                l70Var.d.h(null, null, l70Var.r, null);
                l70Var.f.setAnimation(l70Var.R);
                l70Var.R.M(0);
                break;
            case 9:
                org.telegram.messenger.l0.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(((o70) obj).c), R.raw.done, 36);
                break;
            case 10:
                d80 d80Var = (d80) obj;
                b80 b80Var2 = d80Var.I;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.j6.d6;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i18, false);
                int i19 = b80.y;
                b80Var2.b(i17, 17, w02, true);
                int[] iArr = d80Var.I.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                b80 b80Var3 = d80Var.I;
                b80Var3.c(b80Var3.v, 23, true);
                int[] iArr2 = d80Var.I.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                break;
            case 11:
                z70 z70Var = (z70) obj;
                z70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                d80 d80Var2 = (d80) z70Var.b;
                Intro.setPage(d80Var2.H);
                Intro.setDate((currentTimeMillis - d80Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                b80 b80Var4 = d80Var2.I;
                if (b80Var4 != null && b80Var4.isAlive() && (eGLDisplay = (b80Var = d80Var2.I).c) != null && (eGLSurface = b80Var.f) != null) {
                    try {
                        b80Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                d80 d80Var3 = ((a80) obj).b;
                d80Var3.presentFragment(new yg0(), true);
                d80Var3.M = true;
                break;
            case 13:
                ((b80) obj).finish();
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
                ((za0) obj).a.C0.setVisibility(8);
                break;
            case 16:
                ((fc0) obj).g0();
                break;
            case 17:
                try {
                    org.telegram.ui.Components.vl0 currentListView = ((id0) obj).y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((oe0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 19:
                re0 re0Var = (re0) obj;
                org.telegram.ui.Components.kj0 kj0Var = re0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = re0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    yg0.T0(re0Var.y, editTextBoldCursor2);
                    kj0Var.getAnimatedDrawable().N(0, false, false);
                    kj0Var.d();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.kj0) obj).d();
                break;
            case 21:
                ((ze0) ((ci.h2) obj).c).getClass();
                break;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                ze0 ze0Var = ((ye0) obj).a;
                double d = ze0Var.Q;
                zf0 zf0Var = ze0Var.v;
                ze0Var.Q = currentTimeMillis2;
                int i20 = (int) (ze0Var.P - (currentTimeMillis2 - d));
                ze0Var.P = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    zf0Var.setTextSize(1, 13.0f);
                    int i24 = ze0Var.E;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            zf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        zf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    ze0Var.r();
                    int i25 = ze0Var.E;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        zf0Var.setTextSize(1, 15.0f);
                        int i26 = ze0Var.E;
                        if (i26 == 4) {
                            zf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            zf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            zf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            zf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.j6.P9;
                        zf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i27, false));
                        zf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                bg0 bg0Var = (bg0) ((ci.p2) obj).b;
                double d10 = currentTimeMillis3 - bg0Var.b0;
                bg0Var.b0 = currentTimeMillis3;
                int i28 = (int) (bg0Var.W - d10);
                bg0Var.W = i28;
                if (i28 <= 1000) {
                    bg0Var.setProblemTextVisible(true);
                    bg0Var.v.setVisibility(8);
                    zf0 zf0Var2 = bg0Var.x;
                    if (zf0Var2 != null) {
                        zf0Var2.setVisibility(0);
                    }
                    bg0Var.v();
                    break;
                }
                break;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                bg0 bg0Var2 = ((ag0) obj).a;
                double d11 = bg0Var2.a0;
                zf0 zf0Var3 = bg0Var2.v;
                bg0Var2.a0 = currentTimeMillis4;
                int i29 = (int) (bg0Var2.V - (currentTimeMillis4 - d11));
                bg0Var2.V = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = bg0Var2.g0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (bg0Var2.f0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                zf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            zf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        zf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    bg0Var2.w();
                    int i34 = bg0Var2.g0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            zf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            zf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            zf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.j6.P9;
                        zf0Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i35, false));
                        zf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 25:
                ((org.telegram.ui.Components.vn0) obj).run();
                break;
            case 26:
                ((ih0) obj).setSkipDrawSelector(false);
                break;
            case 27:
                ((org.telegram.ui.Components.ui) obj).setVisibility(8);
                break;
            case 28:
                AndroidUtilities.showKeyboard(((fk0) ((g) obj).b).Q);
                break;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
        }
    }
}
