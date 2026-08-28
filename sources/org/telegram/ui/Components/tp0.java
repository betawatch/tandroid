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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tp0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                ((up0) obj).setVisibility(8);
                break;
            case 1:
                eu0 eu0Var = ((uq0) obj).C;
                if (eu0Var.y1) {
                    eu0Var.b1(false);
                    break;
                }
                break;
            case 2:
                ((cs0) obj).f.m1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var = ((ns0) obj).f.r1;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((tp0) obj).run();
                break;
            case 5:
                ot0 ot0Var = (ot0) obj;
                ArrayList arrayList3 = ot0Var.f;
                if (ot0Var.h) {
                    ot0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i10)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i10)).dialogId));
                        }
                    }
                    ot0Var.x.r1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 6:
                ((pt0) obj).F();
                break;
            case 7:
                ((xu0) obj).X();
                break;
            case 8:
                ((gv0) obj).getClass();
                break;
            case 9:
                zv0 zv0Var = (zv0) obj;
                if (!zv0Var.w) {
                    zv0Var.y = 0.0f;
                    break;
                }
                break;
            case 10:
                ((kx0) obj).b();
                break;
            case 11:
                ux0 ux0Var = (ux0) obj;
                int i11 = ux0Var.a;
                ux0Var.B = null;
                sx0 sx0Var = ux0Var.c;
                if (sx0Var != null && sx0Var.getEditField() != null && ux0Var.c.getFieldText() != null) {
                    int selectionStart = ux0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = ux0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ux0Var.s = false;
                        fh.d2 d2Var = ux0Var.d;
                        if (d2Var != null) {
                            d2Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = ux0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i11).isPremium()) {
                            t5[] t5VarArr = z10 ? (t5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, t5.class) : null;
                            if ((t5VarArr == null || t5VarArr.length == 0) && selectionEnd < 52) {
                                ux0Var.s = true;
                                ux0Var.c();
                                ux0Var.P = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = ux0Var.D;
                                    if (str == null || ux0Var.C != 1 || !str.equals(substring) || ux0Var.x || (arrayList = ux0Var.w) == null || arrayList.isEmpty()) {
                                        int i12 = ux0Var.E + 1;
                                        ux0Var.E = i12;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (ux0Var.F == null || Math.abs(currentTimeMillis - ux0Var.H) > 360) {
                                            ux0Var.H = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            ux0Var.H = currentTimeMillis;
                                            currentKeyboardLanguage = ux0Var.F;
                                        }
                                        String[] strArr = ux0Var.F;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        ux0Var.F = currentKeyboardLanguage;
                                        Runnable runnable = ux0Var.G;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            ux0Var.G = null;
                                        }
                                        ux0Var.G = new c3.d(ux0Var, currentKeyboardLanguage, substring, i12, 27);
                                        ArrayList arrayList5 = ux0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(ux0Var.G, 600L);
                                        } else {
                                            ux0Var.G.run();
                                        }
                                    } else {
                                        ux0Var.v = false;
                                        ux0Var.c();
                                        ux0Var.d.setVisibility(0);
                                        ux0Var.Q = AndroidUtilities.dp(10.0f);
                                        ux0Var.d.invalidate();
                                    }
                                }
                                fh.d2 d2Var2 = ux0Var.d;
                                if (d2Var2 != null) {
                                    d2Var2.invalidate();
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
                                    ux0Var.s = true;
                                    ux0Var.c();
                                    ux0Var.P = emojiSpan;
                                    ux0Var.S = null;
                                    ux0Var.R = null;
                                    if (substring2 != null) {
                                        String str2 = ux0Var.D;
                                        if (str2 == null || ux0Var.C != 2 || !str2.equals(substring2) || ux0Var.x || (arrayList2 = ux0Var.w) == null || arrayList2.isEmpty()) {
                                            int i13 = ux0Var.E + 1;
                                            ux0Var.E = i13;
                                            Runnable runnable2 = ux0Var.G;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            ux0Var.G = new org.telegram.ui.rl(ux0Var, substring2, i13, 22);
                                            ArrayList arrayList6 = ux0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(ux0Var.G, 600L);
                                            } else {
                                                ux0Var.G.run();
                                            }
                                        } else {
                                            ux0Var.v = false;
                                            ux0Var.c();
                                            fh.d2 d2Var3 = ux0Var.d;
                                            if (d2Var3 != null) {
                                                d2Var3.setVisibility(0);
                                                ux0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    fh.d2 d2Var4 = ux0Var.d;
                                    if (d2Var4 != null) {
                                        d2Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = ux0Var.G;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            ux0Var.G = null;
                        }
                        ux0Var.s = false;
                        fh.d2 d2Var5 = ux0Var.d;
                        if (d2Var5 != null) {
                            d2Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    ux0Var.s = false;
                    ux0Var.v = true;
                    fh.d2 d2Var6 = ux0Var.d;
                    if (d2Var6 != null) {
                        d2Var6.invalidate();
                        break;
                    }
                }
                break;
            case 12:
                ay0 ay0Var = (ay0) obj;
                ay0Var.C = null;
                ay0Var.b();
                break;
            case 13:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 14:
                ((uz0) obj).a();
                break;
            case 15:
                ArrayList arrayList7 = ((a01) obj).a;
                for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                    ((View) arrayList7.get(i14)).setVisibility(8);
                    if (arrayList7.get(i14) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i14)).J3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i14)).L3(false, false, false);
                    }
                }
                break;
            case 16:
                a11 a11Var = (a11) obj;
                a11Var.F = null;
                a11Var.D.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f).start();
                break;
            case 17:
                e11 e11Var = (e11) obj;
                ViewPropertyAnimator duration = e11Var.animate().alpha(0.0f).setListener(new r60(e11Var, 28)).setDuration(300L);
                e11Var.b = duration;
                duration.start();
                break;
            case 18:
                g11 g11Var = (g11) obj;
                Utilities.Callback callback = g11Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(g11Var.a.s));
                    break;
                }
                break;
            case 19:
                b21 b21Var = ((r11) obj).b;
                if (b21Var.k()) {
                    b21Var.l();
                    break;
                }
                break;
            case 20:
                MessageObject messageObject = (MessageObject) obj;
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                break;
            case 21:
                ((Utilities.Callback2) obj).run(null, Boolean.FALSE);
                break;
            case 22:
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                break;
            case 23:
                ((j31) obj).c.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.nk) obj).c.presentFragment(new org.telegram.ui.b31());
                break;
            case 25:
                ((s31) obj).requestLayout();
                break;
            case 26:
                ((j41) obj).f();
                break;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i15 = UndoView.a0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((l51) obj).invalidateSelf();
                break;
            default:
                hz hzVar = ((y51) obj).b;
                if (hzVar != null) {
                    hzVar.e(false, true, false);
                    break;
                }
                break;
        }
    }
}
