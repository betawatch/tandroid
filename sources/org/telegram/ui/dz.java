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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dz(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        h70 h70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((jz) obj).a.getBackground().setState(new int[0]);
                break;
            case 1:
                e10 e10Var = (e10) obj;
                AndroidUtilities.cancelRunOnUIThread(e10Var.n0);
                e10Var.a.a(false, true);
                break;
            case 2:
                e10 e10Var2 = ((t00) obj).a;
                e10Var2.h(e10Var2.E, e10Var2.F, e10Var2.H, e10Var2.G, e10Var2.y, e10Var2.J, e10Var2.w, false);
                break;
            case 3:
                ((FiltersSetupActivity) ((g10) obj).W2).getMessagesController().lockFiltersInternal();
                break;
            case 4:
                h10 h10Var = (h10) obj;
                h10Var.s.a();
                h10Var.n.invalidate();
                h10Var.E.Z(true);
                break;
            case 5:
                FiltersSetupActivity filtersSetupActivity = ((o10) obj).d;
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
                            a02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new f10(filtersSetupActivity, i12)).j();
                            break;
                        }
                    }
                    break;
                }
                break;
            case 6:
                q50 q50Var = ((x20) obj).b;
                q50Var.j2 = null;
                q50Var.K1(q50Var.F1, true);
                break;
            case 7:
                y40 y40Var = (y40) obj;
                q50 q50Var2 = y40Var.f;
                j30 j30Var = q50Var2.b;
                ImageLocation imageLocation = y40Var.d;
                if (imageLocation != null) {
                    j30Var.K0 = imageLocation;
                    j30Var.q1 = null;
                    j30Var.r1 = null;
                    y40Var.d = null;
                }
                TLRPC.Chat chat = q50Var2.d.getMessagesController().getChat(Long.valueOf(-y40Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(y40Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(y40Var.c);
                }
                j30Var.setCreateThumbFromParent(false);
                j30Var.H(null, forChat, forChat2, true);
                y40Var.c = null;
                y40Var.b = null;
                AndroidUtilities.updateVisibleRows(q50Var2.Q);
                y40Var.a(1.0f);
                break;
            case 8:
                v10 v10Var = ((b50) obj).g;
                if (v10Var != null) {
                    v10Var.invalidate();
                    break;
                }
                break;
            case 9:
                s60 s60Var = (s60) obj;
                s60Var.y = null;
                s60Var.E = null;
                s60Var.F = null;
                s60Var.G = null;
                s60Var.I = null;
                s60Var.H = null;
                s60Var.J = 0.0d;
                s60Var.Z(false, true);
                s60Var.d.h(null, null, s60Var.r, null);
                s60Var.f.setAnimation(s60Var.R);
                s60Var.R.M(0);
                break;
            case 10:
                org.telegram.messenger.g0.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(((v60) obj).c), R.raw.done, 36);
                break;
            case 11:
                j70 j70Var = (j70) obj;
                h70 h70Var2 = j70Var.I;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.h6.d6;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i18, false);
                int i19 = h70.y;
                h70Var2.b(i17, 17, x02, true);
                int[] iArr = j70Var.I.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                h70 h70Var3 = j70Var.I;
                h70Var3.c(h70Var3.v, 23, true);
                int[] iArr2 = j70Var.I.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
                break;
            case 12:
                f70 f70Var = (f70) obj;
                f70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                j70 j70Var2 = (j70) f70Var.b;
                Intro.setPage(j70Var2.H);
                Intro.setDate((currentTimeMillis - j70Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                h70 h70Var4 = j70Var2.I;
                if (h70Var4 != null && h70Var4.isAlive() && (eGLDisplay = (h70Var = j70Var2.I).c) != null && (eGLSurface = h70Var.f) != null) {
                    try {
                        h70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 13:
                j70 j70Var3 = ((g70) obj).b;
                j70Var3.presentFragment(new dg0(), true);
                j70Var3.M = true;
                break;
            case 14:
                ((h70) obj).finish();
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
                ((aa0) obj).a.C0.setVisibility(8);
                break;
            case 17:
                gb0 gb0Var = (gb0) obj;
                zh.c1 c1Var = gb0Var.d;
                if (c1Var != null) {
                    gb0Var.d0(c1Var.getCurrentLink());
                    break;
                }
                break;
            case 18:
                try {
                    org.telegram.ui.Components.jm0 currentListView = ((nc0) ((lc0) obj).z0).K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 19:
                EditTextBoldCursor[] editTextBoldCursorArr = ((sd0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 20:
                vd0 vd0Var = (vd0) obj;
                org.telegram.ui.Components.yj0 yj0Var = vd0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = vd0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    dg0.T0(vd0Var.y, editTextBoldCursor2);
                    yj0Var.getAnimatedDrawable().N(0, false, false);
                    yj0Var.d();
                    break;
                }
                break;
            case 21:
                ((org.telegram.ui.Components.yj0) obj).d();
                break;
            case 22:
                ((de0) ((ei.e2) obj).c).getClass();
                break;
            case 23:
                double currentTimeMillis2 = System.currentTimeMillis();
                de0 de0Var = ((ce0) obj).a;
                double d = de0Var.Q;
                ff0 ff0Var = de0Var.v;
                de0Var.Q = currentTimeMillis2;
                int i20 = (int) (de0Var.P - (currentTimeMillis2 - d));
                de0Var.P = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    ff0Var.setTextSize(1, 13.0f);
                    int i24 = de0Var.E;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            ff0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        ff0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    de0Var.r();
                    int i25 = de0Var.E;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        ff0Var.setTextSize(1, 15.0f);
                        int i26 = de0Var.E;
                        if (i26 == 4) {
                            ff0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            ff0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            ff0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            ff0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.h6.P9;
                        ff0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i27, false));
                        ff0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 24:
                double currentTimeMillis3 = System.currentTimeMillis();
                hf0 hf0Var = (hf0) ((e6.r) obj).b;
                double d10 = currentTimeMillis3 - hf0Var.b0;
                hf0Var.b0 = currentTimeMillis3;
                int i28 = (int) (hf0Var.W - d10);
                hf0Var.W = i28;
                if (i28 <= 1000) {
                    hf0Var.setProblemTextVisible(true);
                    hf0Var.v.setVisibility(8);
                    ff0 ff0Var2 = hf0Var.x;
                    if (ff0Var2 != null) {
                        ff0Var2.setVisibility(0);
                    }
                    hf0Var.u();
                    break;
                }
                break;
            case 25:
                double currentTimeMillis4 = System.currentTimeMillis();
                hf0 hf0Var2 = ((gf0) obj).a;
                double d11 = hf0Var2.a0;
                ff0 ff0Var3 = hf0Var2.v;
                hf0Var2.a0 = currentTimeMillis4;
                int i29 = (int) (hf0Var2.V - (currentTimeMillis4 - d11));
                hf0Var2.V = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = hf0Var2.g0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (hf0Var2.f0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                ff0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            ff0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        ff0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    hf0Var2.w();
                    int i34 = hf0Var2.g0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            ff0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            ff0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            ff0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.h6.P9;
                        ff0Var3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i35, false));
                        ff0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 26:
                ((org.telegram.ui.Components.i90) obj).run();
                break;
            case 27:
                ((pg0) obj).setSkipDrawSelector(false);
                break;
            case 28:
                ((org.telegram.ui.Components.si) obj).setVisibility(8);
                break;
            default:
                AndroidUtilities.showKeyboard(((mj0) ((g) obj).b).Q);
                break;
        }
    }
}
