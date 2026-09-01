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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oq0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((pq0) obj).setVisibility(8);
                break;
            case 1:
                zu0 zu0Var = ((or0) obj).D;
                if (zu0Var.z1) {
                    zu0Var.b1(false);
                    break;
                }
                break;
            case 2:
                ((ws0) obj).f.m1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var = ((ht0) obj).f.s1;
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((oq0) obj).run();
                break;
            case 5:
                iu0 iu0Var = (iu0) obj;
                ArrayList arrayList3 = iu0Var.f;
                if (iu0Var.h) {
                    iu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    iu0Var.x.s1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 6:
                ((ku0) obj).F();
                break;
            case 7:
                ((qv0) obj).X();
                break;
            case 8:
                ((aw0) obj).getClass();
                break;
            case 9:
                tw0 tw0Var = (tw0) obj;
                if (!tw0Var.w) {
                    tw0Var.y = 0.0f;
                    break;
                }
                break;
            case 10:
                ((gy0) obj).b();
                break;
            case 11:
                ry0 ry0Var = (ry0) obj;
                int i12 = ry0Var.a;
                ry0Var.C = null;
                py0 py0Var = ry0Var.c;
                if (py0Var != null && py0Var.getEditField() != null && ry0Var.c.getFieldText() != null) {
                    int selectionStart = ry0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = ry0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ry0Var.s = false;
                        eg.s2 s2Var = ry0Var.d;
                        if (s2Var != null) {
                            s2Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = ry0Var.c.getFieldText();
                        boolean z4 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z4 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            u5[] u5VarArr = z4 ? (u5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, u5.class) : null;
                            if ((u5VarArr == null || u5VarArr.length == 0) && selectionEnd < 52) {
                                ry0Var.s = true;
                                ry0Var.c();
                                ry0Var.Q = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = ry0Var.E;
                                    if (str == null || ry0Var.D != 1 || !str.equals(substring) || ry0Var.x || (arrayList = ry0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = ry0Var.F + 1;
                                        ry0Var.F = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (ry0Var.G == null || Math.abs(currentTimeMillis - ry0Var.I) > 360) {
                                            ry0Var.I = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            ry0Var.I = currentTimeMillis;
                                            currentKeyboardLanguage = ry0Var.G;
                                        }
                                        String[] strArr = ry0Var.G;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        ry0Var.G = currentKeyboardLanguage;
                                        Runnable runnable = ry0Var.H;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            ry0Var.H = null;
                                        }
                                        ry0Var.H = new dg.u1(ry0Var, currentKeyboardLanguage, substring, i13, 26);
                                        ArrayList arrayList5 = ry0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(ry0Var.H, 600L);
                                        } else {
                                            ry0Var.H.run();
                                        }
                                    } else {
                                        ry0Var.v = false;
                                        ry0Var.c();
                                        ry0Var.d.setVisibility(0);
                                        ry0Var.R = AndroidUtilities.dp(10.0f);
                                        ry0Var.d.invalidate();
                                    }
                                }
                                eg.s2 s2Var2 = ry0Var.d;
                                if (s2Var2 != null) {
                                    s2Var2.invalidate();
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
                                    ry0Var.s = true;
                                    ry0Var.c();
                                    ry0Var.Q = emojiSpan;
                                    ry0Var.T = null;
                                    ry0Var.S = null;
                                    if (substring2 != null) {
                                        String str2 = ry0Var.E;
                                        if (str2 == null || ry0Var.D != 2 || !str2.equals(substring2) || ry0Var.x || (arrayList2 = ry0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = ry0Var.F + 1;
                                            ry0Var.F = i14;
                                            Runnable runnable2 = ry0Var.H;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            ry0Var.H = new gy(ry0Var, substring2, i14, 19);
                                            ArrayList arrayList6 = ry0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(ry0Var.H, 600L);
                                            } else {
                                                ry0Var.H.run();
                                            }
                                        } else {
                                            ry0Var.v = false;
                                            ry0Var.c();
                                            eg.s2 s2Var3 = ry0Var.d;
                                            if (s2Var3 != null) {
                                                s2Var3.setVisibility(0);
                                                ry0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    eg.s2 s2Var4 = ry0Var.d;
                                    if (s2Var4 != null) {
                                        s2Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = ry0Var.H;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            ry0Var.H = null;
                        }
                        ry0Var.s = false;
                        eg.s2 s2Var5 = ry0Var.d;
                        if (s2Var5 != null) {
                            s2Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    ry0Var.s = false;
                    ry0Var.v = true;
                    eg.s2 s2Var6 = ry0Var.d;
                    if (s2Var6 != null) {
                        s2Var6.invalidate();
                        break;
                    }
                }
                break;
            case 12:
                xy0 xy0Var = (xy0) obj;
                xy0Var.D = null;
                xy0Var.b();
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
                ((s01) obj).a();
                break;
            case 15:
                ArrayList arrayList7 = ((y01) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 16:
                x11 x11Var = (x11) obj;
                x11Var.G = null;
                x11Var.E.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(pr.f).start();
                break;
            case 17:
                b21 b21Var = (b21) obj;
                ViewPropertyAnimator duration = b21Var.animate().alpha(0.0f).setListener(new pd0(b21Var, 21)).setDuration(300L);
                b21Var.b = duration;
                duration.start();
                break;
            case 18:
                d21 d21Var = (d21) obj;
                Utilities.Callback callback = d21Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(d21Var.a.s));
                    break;
                }
                break;
            case 19:
                x21 x21Var = ((o21) obj).b;
                if (x21Var.k()) {
                    x21Var.l();
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
                ((org.telegram.ui.ActionBar.p1) obj).dismiss();
                break;
            case 23:
                ((g41) obj).c.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.wk) obj).c.presentFragment(new org.telegram.ui.p31());
                break;
            case 25:
                ((q41) obj).requestLayout();
                break;
            case 26:
                ((h51) obj).f();
                break;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.b0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((l61) obj).invalidateSelf();
                break;
            default:
                xz xzVar = ((y61) obj).b;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    break;
                }
                break;
        }
    }
}
