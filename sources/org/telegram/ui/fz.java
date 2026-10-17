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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fz(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        j70 j70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((lz) obj).a.getBackground().setState(new int[0]);
                break;
            case 1:
                g10 g10Var = (g10) obj;
                AndroidUtilities.cancelRunOnUIThread(g10Var.n0);
                g10Var.a.a(false, true);
                break;
            case 2:
                g10 g10Var2 = ((v00) obj).a;
                g10Var2.h(g10Var2.E, g10Var2.F, g10Var2.H, g10Var2.G, g10Var2.y, g10Var2.J, g10Var2.w, false);
                break;
            case 3:
                ((FiltersSetupActivity) ((i10) obj).W2).getMessagesController().lockFiltersInternal();
                break;
            case 4:
                j10 j10Var = (j10) obj;
                j10Var.s.a();
                j10Var.n.invalidate();
                j10Var.E.Z(true);
                break;
            case 5:
                FiltersSetupActivity filtersSetupActivity = ((q10) obj).d;
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
                            a02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new h10(filtersSetupActivity, i12)).j();
                            break;
                        }
                    }
                    break;
                }
                break;
            case 6:
                s50 s50Var = ((z20) obj).b;
                s50Var.j2 = null;
                s50Var.K1(s50Var.F1, true);
                break;
            case 7:
                a50 a50Var = (a50) obj;
                s50 s50Var2 = a50Var.f;
                l30 l30Var = s50Var2.b;
                ImageLocation imageLocation = a50Var.d;
                if (imageLocation != null) {
                    l30Var.K0 = imageLocation;
                    l30Var.q1 = null;
                    l30Var.r1 = null;
                    a50Var.d = null;
                }
                TLRPC.Chat chat = s50Var2.d.getMessagesController().getChat(Long.valueOf(-a50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(a50Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(a50Var.c);
                }
                l30Var.setCreateThumbFromParent(false);
                l30Var.H(null, forChat, forChat2, true);
                a50Var.c = null;
                a50Var.b = null;
                AndroidUtilities.updateVisibleRows(s50Var2.Q);
                a50Var.a(1.0f);
                break;
            case 8:
                x10 x10Var = ((d50) obj).g;
                if (x10Var != null) {
                    x10Var.invalidate();
                    break;
                }
                break;
            case 9:
                u60 u60Var = (u60) obj;
                u60Var.y = null;
                u60Var.E = null;
                u60Var.F = null;
                u60Var.G = null;
                u60Var.I = null;
                u60Var.H = null;
                u60Var.J = 0.0d;
                u60Var.Z(false, true);
                u60Var.d.h(null, null, u60Var.r, null);
                u60Var.f.setAnimation(u60Var.R);
                u60Var.R.M(0);
                break;
            case 10:
                org.telegram.messenger.q.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(((x60) obj).c), R.raw.done, 36);
                break;
            case 11:
                l70 l70Var = (l70) obj;
                j70 j70Var2 = l70Var.I;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.h6.d6;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i18, false);
                int i19 = j70.y;
                j70Var2.b(i17, 17, x02, true);
                int[] iArr = l70Var.I.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                j70 j70Var3 = l70Var.I;
                j70Var3.c(j70Var3.v, 23, true);
                int[] iArr2 = l70Var.I.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
                break;
            case 12:
                h70 h70Var = (h70) obj;
                h70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                l70 l70Var2 = (l70) h70Var.b;
                Intro.setPage(l70Var2.H);
                Intro.setDate((currentTimeMillis - l70Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                j70 j70Var4 = l70Var2.I;
                if (j70Var4 != null && j70Var4.isAlive() && (eGLDisplay = (j70Var = l70Var2.I).c) != null && (eGLSurface = j70Var.f) != null) {
                    try {
                        j70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 13:
                l70 l70Var3 = ((i70) obj).b;
                l70Var3.presentFragment(new fg0(), true);
                l70Var3.M = true;
                break;
            case 14:
                ((j70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 15:
                ((pf.c) obj).b();
                break;
            case 16:
                ((ca0) obj).a.C0.setVisibility(8);
                break;
            case 17:
                ib0 ib0Var = (ib0) obj;
                zh.b1 b1Var = ib0Var.d;
                if (b1Var != null) {
                    ib0Var.c0(b1Var.getCurrentLink());
                    break;
                }
                break;
            case 18:
                try {
                    org.telegram.ui.Components.im0 currentListView = ((pc0) ((nc0) obj).z0).K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 19:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ud0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 20:
                xd0 xd0Var = (xd0) obj;
                org.telegram.ui.Components.xj0 xj0Var = xd0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = xd0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    fg0.T0(xd0Var.y, editTextBoldCursor2);
                    xj0Var.getAnimatedDrawable().N(0, false, false);
                    xj0Var.d();
                    break;
                }
                break;
            case 21:
                ((org.telegram.ui.Components.xj0) obj).d();
                break;
            case 22:
                ((fe0) ((ei.e2) obj).c).getClass();
                break;
            case 23:
                double currentTimeMillis2 = System.currentTimeMillis();
                fe0 fe0Var = ((ee0) obj).a;
                double d = fe0Var.Q;
                hf0 hf0Var = fe0Var.v;
                fe0Var.Q = currentTimeMillis2;
                int i20 = (int) (fe0Var.P - (currentTimeMillis2 - d));
                fe0Var.P = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    hf0Var.setTextSize(1, 13.0f);
                    int i24 = fe0Var.E;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            hf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        hf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    fe0Var.r();
                    int i25 = fe0Var.E;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        hf0Var.setTextSize(1, 15.0f);
                        int i26 = fe0Var.E;
                        if (i26 == 4) {
                            hf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            hf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            hf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            hf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.h6.P9;
                        hf0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i27, false));
                        hf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 24:
                double currentTimeMillis3 = System.currentTimeMillis();
                jf0 jf0Var = (jf0) ((e6.r) obj).b;
                double d10 = currentTimeMillis3 - jf0Var.b0;
                jf0Var.b0 = currentTimeMillis3;
                int i28 = (int) (jf0Var.W - d10);
                jf0Var.W = i28;
                if (i28 <= 1000) {
                    jf0Var.setProblemTextVisible(true);
                    jf0Var.v.setVisibility(8);
                    hf0 hf0Var2 = jf0Var.x;
                    if (hf0Var2 != null) {
                        hf0Var2.setVisibility(0);
                    }
                    jf0Var.u();
                    break;
                }
                break;
            case 25:
                double currentTimeMillis4 = System.currentTimeMillis();
                jf0 jf0Var2 = ((if0) obj).a;
                double d11 = jf0Var2.a0;
                hf0 hf0Var3 = jf0Var2.v;
                jf0Var2.a0 = currentTimeMillis4;
                int i29 = (int) (jf0Var2.V - (currentTimeMillis4 - d11));
                jf0Var2.V = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = jf0Var2.g0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (jf0Var2.f0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                hf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            hf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        hf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    jf0Var2.w();
                    int i34 = jf0Var2.g0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            hf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            hf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            hf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.h6.P9;
                        hf0Var3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i35, false));
                        hf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 26:
                ((org.telegram.ui.Components.i90) obj).run();
                break;
            case 27:
                ((rg0) obj).setSkipDrawSelector(false);
                break;
            case 28:
                ((org.telegram.ui.Components.si) obj).setVisibility(8);
                break;
            default:
                AndroidUtilities.showKeyboard(((oj0) ((g) obj).b).Q);
                break;
        }
    }
}
