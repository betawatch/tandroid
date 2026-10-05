package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gq0(ci.k2 k2Var, int i10) {
        this.a = 11;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((br0) ((ci.i2) obj).b).X0(1);
                break;
            case 1:
                fr0 fr0Var = (fr0) obj;
                dr0[] dr0VarArr = fr0Var.a;
                if (fr0Var.b != 1) {
                    for (dr0 dr0Var : dr0VarArr) {
                        org.telegram.ui.ActionBar.i5 i5Var = dr0Var.d;
                        i5Var.setAlpha(1.0f);
                        i5Var.setScaleX(1.0f);
                        i5Var.setScaleY(1.0f);
                        dr0Var.e.setAlpha(0.0f);
                    }
                    fr0Var.E = false;
                    AndroidUtilities.runOnUIThread(fr0Var.G, 4000L);
                    break;
                } else {
                    fr0Var.E = !fr0Var.E;
                    int length = dr0VarArr.length;
                    while (i11 < length) {
                        dr0 dr0Var2 = dr0VarArr[i11];
                        org.telegram.ui.ActionBar.i5 i5Var2 = dr0Var2.d;
                        org.telegram.ui.ActionBar.i5 i5Var3 = dr0Var2.e;
                        i5Var2.setPivotX(0.0f);
                        i5Var3.setPivotX(0.0f);
                        if (fr0Var.E) {
                            i5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            i5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            i5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            i5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                        i11++;
                    }
                    AndroidUtilities.runOnUIThread(fr0Var.G, 4000L);
                    break;
                }
            case 2:
                ((dr0) obj).setVisibility(8);
                break;
            case 3:
                qv0 qv0Var = ((es0) obj).G;
                if (qv0Var.C1) {
                    qv0Var.b1(false);
                    break;
                }
                break;
            case 4:
                ((ot0) obj).f.m1(false);
                break;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var = ((zt0) obj).f.v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 6:
                ((gq0) obj).run();
                break;
            case 7:
                av0 av0Var = (av0) obj;
                ArrayList arrayList3 = av0Var.f;
                if (av0Var.h) {
                    av0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    av0Var.x.v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 8:
                ((bv0) obj).F();
                break;
            case 9:
                ((mw0) obj).X();
                break;
            case 10:
                ((vw0) obj).getClass();
                break;
            case 11:
                ((sx0) obj).l0(0);
                break;
            case 12:
                nx0 nx0Var = (nx0) obj;
                if (!nx0Var.w) {
                    nx0Var.y = 0.0f;
                    break;
                }
                break;
            case 13:
                ((zy0) obj).b();
                break;
            case 14:
                jz0 jz0Var = (jz0) obj;
                int i12 = jz0Var.a;
                jz0Var.F = null;
                hz0 hz0Var = jz0Var.c;
                if (hz0Var != null && hz0Var.getEditField() != null && jz0Var.c.getFieldText() != null) {
                    int selectionStart = jz0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = jz0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        jz0Var.s = false;
                        ai.f0 f0Var = jz0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = jz0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            z5[] z5VarArr = z10 ? (z5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, z5.class) : null;
                            if ((z5VarArr == null || z5VarArr.length == 0) && selectionEnd < 52) {
                                jz0Var.s = true;
                                jz0Var.c();
                                jz0Var.T = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = jz0Var.H;
                                    if (str == null || jz0Var.G != 1 || !str.equals(substring) || jz0Var.x || (arrayList = jz0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = jz0Var.I + 1;
                                        jz0Var.I = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (jz0Var.J == null || Math.abs(currentTimeMillis - jz0Var.L) > 360) {
                                            jz0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            jz0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = jz0Var.J;
                                        }
                                        String[] strArr = jz0Var.J;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        jz0Var.J = currentKeyboardLanguage;
                                        Runnable runnable = jz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            jz0Var.K = null;
                                        }
                                        jz0Var.K = new ai.c9(jz0Var, currentKeyboardLanguage, substring, i13, 27);
                                        ArrayList arrayList5 = jz0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(jz0Var.K, 600L);
                                        } else {
                                            jz0Var.K.run();
                                        }
                                    } else {
                                        jz0Var.v = false;
                                        jz0Var.c();
                                        jz0Var.d.setVisibility(0);
                                        jz0Var.U = AndroidUtilities.dp(10.0f);
                                        jz0Var.d.invalidate();
                                    }
                                }
                                ai.f0 f0Var2 = jz0Var.d;
                                if (f0Var2 != null) {
                                    f0Var2.invalidate();
                                    break;
                                }
                            }
                        } else {
                            Emoji.EmojiSpan emojiSpan = emojiSpanArr[emojiSpanArr.length - 1];
                            if (emojiSpan != null) {
                                Spanned spanned = (Spanned) fieldText;
                                int spanStart = spanned.getSpanStart(emojiSpan);
                                int spanEnd = spanned.getSpanEnd(emojiSpan);
                                if (selectionStart == spanEnd) {
                                    String substring2 = fieldText.toString().substring(spanStart, spanEnd);
                                    jz0Var.s = true;
                                    jz0Var.c();
                                    jz0Var.T = emojiSpan;
                                    jz0Var.W = null;
                                    jz0Var.V = null;
                                    if (substring2 != null) {
                                        String str2 = jz0Var.H;
                                        if (str2 == null || jz0Var.G != 2 || !str2.equals(substring2) || jz0Var.x || (arrayList2 = jz0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = jz0Var.I + 1;
                                            jz0Var.I = i14;
                                            Runnable runnable2 = jz0Var.K;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            jz0Var.K = new zm(jz0Var, substring2, i14, 21);
                                            ArrayList arrayList6 = jz0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(jz0Var.K, 600L);
                                            } else {
                                                jz0Var.K.run();
                                            }
                                        } else {
                                            jz0Var.v = false;
                                            jz0Var.c();
                                            ai.f0 f0Var3 = jz0Var.d;
                                            if (f0Var3 != null) {
                                                f0Var3.setVisibility(0);
                                                jz0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    ai.f0 f0Var4 = jz0Var.d;
                                    if (f0Var4 != null) {
                                        f0Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = jz0Var.K;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            jz0Var.K = null;
                        }
                        jz0Var.s = false;
                        ai.f0 f0Var5 = jz0Var.d;
                        if (f0Var5 != null) {
                            f0Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    jz0Var.s = false;
                    jz0Var.v = true;
                    ai.f0 f0Var6 = jz0Var.d;
                    if (f0Var6 != null) {
                        f0Var6.invalidate();
                        break;
                    }
                }
                break;
            case 15:
                pz0 pz0Var = (pz0) obj;
                pz0Var.G = null;
                pz0Var.b();
                break;
            case 16:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 17:
                ((m11) obj).a();
                break;
            case 18:
                ArrayList arrayList7 = ((t11) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 19:
                t21 t21Var = (t21) obj;
                t21Var.J = null;
                t21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(tr.f).start();
                break;
            case 20:
                x21 x21Var = (x21) obj;
                ViewPropertyAnimator duration = x21Var.animate().alpha(0.0f).setListener(new hd0(x21Var, 23)).setDuration(300L);
                x21Var.b = duration;
                duration.start();
                break;
            case 21:
                z21 z21Var = (z21) obj;
                Utilities.Callback callback = z21Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(z21Var.a.s));
                    break;
                }
                break;
            case 22:
                w31 w31Var = ((n31) obj).b;
                if (w31Var.k()) {
                    w31Var.l();
                    break;
                }
                break;
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                break;
            case 24:
                ((Utilities.Callback2) obj).run(null, Boolean.FALSE);
                break;
            case 25:
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                break;
            case 26:
                ((e51) obj).c.setVisibility(8);
                break;
            case 27:
                ((org.telegram.ui.wk) obj).c.presentFragment(new org.telegram.ui.w31());
                break;
            case 28:
                ((o51) obj).requestLayout();
                break;
            default:
                ((f61) obj).f();
                break;
        }
    }

    public /* synthetic */ gq0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
