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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class i10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i10(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        a80 a80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                z10 z10Var = (z10) obj;
                AndroidUtilities.cancelRunOnUIThread(z10Var.n0);
                z10Var.a.a(false, true);
                break;
            case 1:
                z10 z10Var2 = ((o10) obj).a;
                z10Var2.h(z10Var2.E, z10Var2.F, z10Var2.H, z10Var2.G, z10Var2.y, z10Var2.J, z10Var2.w, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((bi.y1) obj).Y2).getMessagesController().lockFiltersInternal();
                break;
            case 3:
                b20 b20Var = (b20) obj;
                b20Var.s.a();
                b20Var.n.invalidate();
                b20Var.E.Z(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((i20) obj).d;
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
                            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(filtersSetupActivity);
                            int i15 = R.raw.filter_reorder;
                            int i16 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new a20(filtersSetupActivity, i12)).j();
                            break;
                        }
                    }
                    break;
                }
                break;
            case 5:
                j60 j60Var = ((r30) obj).b;
                j60Var.j2 = null;
                j60Var.J1(j60Var.F1, true);
                break;
            case 6:
                q50 q50Var = (q50) obj;
                j60 j60Var2 = q50Var.f;
                d40 d40Var = j60Var2.b;
                ImageLocation imageLocation = q50Var.d;
                if (imageLocation != null) {
                    d40Var.K0 = imageLocation;
                    d40Var.q1 = null;
                    d40Var.r1 = null;
                    q50Var.d = null;
                }
                TLRPC.Chat chat = j60Var2.d.getMessagesController().getChat(Long.valueOf(-q50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(q50Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(q50Var.c);
                }
                d40Var.setCreateThumbFromParent(false);
                d40Var.H(null, forChat, forChat2, true);
                q50Var.c = null;
                q50Var.b = null;
                AndroidUtilities.updateVisibleRows(j60Var2.Q);
                q50Var.a(1.0f);
                break;
            case 7:
                t50 t50Var = ((u50) obj).g;
                if (t50Var != null) {
                    t50Var.invalidate();
                    break;
                }
                break;
            case 8:
                k70 k70Var = (k70) obj;
                k70Var.y = null;
                k70Var.E = null;
                k70Var.F = null;
                k70Var.G = null;
                k70Var.I = null;
                k70Var.H = null;
                k70Var.J = 0.0d;
                k70Var.Z(false, true);
                k70Var.d.h(null, null, k70Var.r, null);
                k70Var.f.setAnimation(k70Var.R);
                k70Var.R.M(0);
                break;
            case 9:
                org.telegram.messenger.a2.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.a0(((n70) obj).c), R.raw.done, 36);
                break;
            case 10:
                c80 c80Var = (c80) obj;
                a80 a80Var2 = c80Var.I;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.j6.d6;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i18, false);
                int i19 = a80.y;
                a80Var2.b(i17, 17, w02, true);
                int[] iArr = c80Var.I.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                a80 a80Var3 = c80Var.I;
                a80Var3.c(a80Var3.v, 23, true);
                int[] iArr2 = c80Var.I.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                break;
            case 11:
                y70 y70Var = (y70) obj;
                y70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                c80 c80Var2 = (c80) y70Var.b;
                Intro.setPage(c80Var2.H);
                Intro.setDate((currentTimeMillis - c80Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                a80 a80Var4 = c80Var2.I;
                if (a80Var4 != null && a80Var4.isAlive() && (eGLDisplay = (a80Var = c80Var2.I).c) != null && (eGLSurface = a80Var.f) != null) {
                    try {
                        a80Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                c80 c80Var3 = ((z70) obj).b;
                c80Var3.presentFragment(new xg0(), true);
                c80Var3.M = true;
                break;
            case 13:
                ((a80) obj).finish();
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
                ((wa0) obj).a.C0.setVisibility(8);
                break;
            case 16:
                ((dc0) obj).g0();
                break;
            case 17:
                try {
                    org.telegram.ui.Components.vl0 currentListView = ((gd0) obj).y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((me0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 19:
                pe0 pe0Var = (pe0) obj;
                org.telegram.ui.Components.kj0 kj0Var = pe0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = pe0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    xg0.T0(pe0Var.y, editTextBoldCursor2);
                    kj0Var.getAnimatedDrawable().N(0, false, false);
                    kj0Var.d();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.kj0) obj).d();
                break;
            case 21:
                ((xe0) ((bi.t2) obj).c).getClass();
                break;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                xe0 xe0Var = ((we0) obj).a;
                double d = xe0Var.Q;
                xf0 xf0Var = xe0Var.v;
                xe0Var.Q = currentTimeMillis2;
                int i20 = (int) (xe0Var.P - (currentTimeMillis2 - d));
                xe0Var.P = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    xf0Var.setTextSize(1, 13.0f);
                    int i24 = xe0Var.E;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            xf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        xf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    xe0Var.r();
                    int i25 = xe0Var.E;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        xf0Var.setTextSize(1, 15.0f);
                        int i26 = xe0Var.E;
                        if (i26 == 4) {
                            xf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            xf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            xf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            xf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.j6.P9;
                        xf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i27, false));
                        xf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                zf0 zf0Var = (zf0) ((bi.b3) obj).b;
                double d10 = currentTimeMillis3 - zf0Var.b0;
                zf0Var.b0 = currentTimeMillis3;
                int i28 = (int) (zf0Var.W - d10);
                zf0Var.W = i28;
                if (i28 <= 1000) {
                    zf0Var.setProblemTextVisible(true);
                    zf0Var.v.setVisibility(8);
                    xf0 xf0Var2 = zf0Var.x;
                    if (xf0Var2 != null) {
                        xf0Var2.setVisibility(0);
                    }
                    zf0Var.v();
                    break;
                }
                break;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                zf0 zf0Var2 = ((yf0) obj).a;
                double d11 = zf0Var2.a0;
                xf0 xf0Var3 = zf0Var2.v;
                zf0Var2.a0 = currentTimeMillis4;
                int i29 = (int) (zf0Var2.V - (currentTimeMillis4 - d11));
                zf0Var2.V = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = zf0Var2.g0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (zf0Var2.f0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                xf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            xf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        xf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    zf0Var2.w();
                    int i34 = zf0Var2.g0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            xf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            xf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            xf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.j6.P9;
                        xf0Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i35, false));
                        xf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 25:
                ((org.telegram.ui.Components.q01) obj).run();
                break;
            case 26:
                ((hh0) obj).setSkipDrawSelector(false);
                break;
            case 27:
                ((org.telegram.ui.Components.xi) obj).setVisibility(8);
                break;
            case 28:
                AndroidUtilities.showKeyboard(((ek0) ((g) obj).b).Q);
                break;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
        }
    }
}
