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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p00(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        n70 n70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                h10 h10Var = (h10) obj;
                AndroidUtilities.cancelRunOnUIThread(h10Var.n0);
                h10Var.a.a(false, true);
                break;
            case 1:
                h10 h10Var2 = ((v00) obj).a;
                h10Var2.h(h10Var2.E, h10Var2.F, h10Var2.H, h10Var2.G, h10Var2.y, h10Var2.J, h10Var2.w, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((k10) obj).g3).getMessagesController().lockFiltersInternal();
                break;
            case 3:
                l10 l10Var = (l10) obj;
                l10Var.s.a();
                l10Var.n.invalidate();
                l10Var.H.c0(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((s10) obj).e;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    int i13 = 0;
                    while (true) {
                        if (i13 < dialogFilters.size()) {
                            if (!dialogFilters.get(i13).isDefault() || i13 == 0) {
                                i13++;
                            } else {
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
                                    filtersSetupActivity2.c0(true);
                                }
                                filtersSetupActivity.a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(filtersSetupActivity);
                                int i15 = R.raw.filter_reorder;
                                int i16 = R.string.LimitReachedReorderFolder;
                                Object[] objArr = new Object[i10];
                                objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                                b02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new i10(filtersSetupActivity, i12)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.b0(null);
                break;
            case 5:
                v50 v50Var = ((c30) obj).b;
                v50Var.j2 = null;
                v50Var.K1(v50Var.F1, true);
                break;
            case 6:
                c50 c50Var = (c50) obj;
                v50 v50Var2 = c50Var.f;
                o30 o30Var = v50Var2.b;
                ImageLocation imageLocation = c50Var.d;
                if (imageLocation != null) {
                    o30Var.K0 = imageLocation;
                    o30Var.q1 = null;
                    o30Var.r1 = null;
                    c50Var.d = null;
                }
                TLRPC.Chat chat = v50Var2.d.getMessagesController().getChat(Long.valueOf(-c50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(c50Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(c50Var.c);
                }
                o30Var.setCreateThumbFromParent(false);
                o30Var.H(null, forChat, forChat2, true);
                c50Var.c = null;
                c50Var.b = null;
                AndroidUtilities.updateVisibleRows(v50Var2.Q);
                c50Var.a(1.0f);
                break;
            case 7:
                z10 z10Var = ((f50) obj).g;
                if (z10Var != null) {
                    z10Var.invalidate();
                    break;
                }
                break;
            case 8:
                x60 x60Var = (x60) obj;
                x60Var.y = null;
                x60Var.E = null;
                x60Var.F = null;
                x60Var.G = null;
                x60Var.I = null;
                x60Var.H = null;
                x60Var.J = 0.0d;
                x60Var.a0(false, true);
                x60Var.d.h(null, null, x60Var.r, null);
                x60Var.f.setAnimation(x60Var.R);
                x60Var.R.M(0);
                break;
            case 9:
                org.telegram.messenger.t.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.b0(((a70) obj).c), R.raw.done, 36);
                break;
            case 10:
                p70 p70Var = (p70) obj;
                n70 n70Var2 = p70Var.I;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.y6.d6;
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, i18, false);
                int i19 = n70.y;
                n70Var2.b(i17, 17, x02, true);
                p70Var.I.d();
                n70 n70Var3 = p70Var.I;
                n70Var3.c(n70Var3.v, 23, true);
                p70Var.I.f();
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, i18, false));
                break;
            case 11:
                l70 l70Var = (l70) obj;
                l70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                p70 p70Var2 = (p70) l70Var.b;
                Intro.setPage(p70Var2.H);
                Intro.setDate((currentTimeMillis - p70Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                n70 n70Var4 = p70Var2.I;
                if (n70Var4 != null && n70Var4.isAlive() && (eGLDisplay = (n70Var = p70Var2.I).c) != null && (eGLSurface = n70Var.f) != null) {
                    try {
                        n70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                p70 p70Var3 = ((m70) obj).b;
                p70Var3.presentFragment(new gg0(), true);
                p70Var3.M = true;
                break;
            case 13:
                ((n70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 14:
                v70 v70Var = (v70) obj;
                v70Var.f.e.smoothScrollTo(0, v70Var.getHeight());
                break;
            case 15:
                ((qf.c) obj).b();
                break;
            case 16:
                fa0 fa0Var = (fa0) obj;
                LaunchActivity launchActivity = fa0Var.c;
                launchActivity.P0 = false;
                boolean z10 = launchActivity.O0;
                launchActivity.F();
                if (z10 != launchActivity.O0) {
                    fa0Var.requestLayout();
                    break;
                }
                break;
            case 17:
                ((ga0) obj).a.C0.setVisibility(8);
                break;
            case 18:
                jb0 jb0Var = (jb0) obj;
                ai.t1 t1Var = jb0Var.d;
                if (t1Var != null) {
                    jb0Var.e0(t1Var.getCurrentLink());
                    break;
                }
                break;
            case 19:
                try {
                    org.telegram.ui.Components.mm0 currentListView = ((pc0) ((nc0) obj).o0).J0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 20:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ud0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 21:
                yd0 yd0Var = (yd0) obj;
                org.telegram.ui.Components.ak0 ak0Var = yd0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = yd0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    gg0.W0(yd0Var.y, editTextBoldCursor2);
                    ak0Var.getAnimatedDrawable().N(0, false, false);
                    ak0Var.d();
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.Components.ak0) obj).d();
                break;
            case 23:
                ((ge0) ((fi.c2) obj).c).getClass();
                break;
            case 24:
                double currentTimeMillis2 = System.currentTimeMillis();
                ge0 ge0Var = ((fe0) obj).a;
                double d = ge0Var.Q;
                hf0 hf0Var = ge0Var.v;
                ge0Var.Q = currentTimeMillis2;
                int i20 = (int) (ge0Var.P - (currentTimeMillis2 - d));
                ge0Var.P = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    hf0Var.setTextSize(1, 13.0f);
                    int i24 = ge0Var.E;
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
                    ge0Var.q();
                    int i25 = ge0Var.E;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        hf0Var.setTextSize(1, 15.0f);
                        int i26 = ge0Var.E;
                        if (i26 == 4) {
                            hf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            hf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            hf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            hf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.y6.P9;
                        org.telegram.ui.ActionBar.f7.V(hf0Var, i27, null);
                        hf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 25:
                double currentTimeMillis3 = System.currentTimeMillis();
                jf0 jf0Var = (jf0) ((f6.r) obj).b;
                double d10 = currentTimeMillis3 - jf0Var.d0;
                jf0Var.d0 = currentTimeMillis3;
                int i28 = (int) (jf0Var.b0 - d10);
                jf0Var.b0 = i28;
                if (i28 <= 1000) {
                    jf0Var.setProblemTextVisible(true);
                    jf0Var.v.setVisibility(8);
                    hf0 hf0Var2 = jf0Var.x;
                    if (hf0Var2 != null) {
                        hf0Var2.setVisibility(0);
                    }
                    jf0Var.t();
                    break;
                }
                break;
            case 26:
                double currentTimeMillis4 = System.currentTimeMillis();
                jf0 jf0Var2 = ((if0) obj).a;
                double d11 = jf0Var2.c0;
                hf0 hf0Var3 = jf0Var2.v;
                jf0Var2.c0 = currentTimeMillis4;
                int i29 = (int) (jf0Var2.a0 - (currentTimeMillis4 - d11));
                jf0Var2.a0 = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = jf0Var2.i0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (jf0Var2.h0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
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
                    jf0Var2.v();
                    int i34 = jf0Var2.i0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            hf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            hf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            hf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.y6.P9;
                        org.telegram.ui.ActionBar.f7.V(hf0Var3, i35, null);
                        hf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 27:
                ((org.telegram.ui.Components.e10) obj).run();
                break;
            case 28:
                ((rg0) obj).setSkipDrawSelector(false);
                break;
            default:
                ((org.telegram.ui.Components.si) obj).setVisibility(8);
                break;
        }
    }
}
