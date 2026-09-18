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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kq0(Object obj, int i10) {
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
                ((lq0) obj).setVisibility(8);
                break;
            case 1:
                zu0 zu0Var = ((nr0) obj).G;
                if (zu0Var.C1) {
                    zu0Var.b1(false);
                    break;
                }
                break;
            case 2:
                ((xs0) obj).f.m1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var = ((it0) obj).f.v1;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((kq0) obj).run();
                break;
            case 5:
                ju0 ju0Var = (ju0) obj;
                ArrayList arrayList3 = ju0Var.f;
                if (ju0Var.h) {
                    ju0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    ju0Var.x.v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
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
                ((zv0) obj).getClass();
                break;
            case 9:
                sw0 sw0Var = (sw0) obj;
                if (!sw0Var.w) {
                    sw0Var.y = 0.0f;
                    break;
                }
                break;
            case 10:
                ((ey0) obj).b();
                break;
            case 11:
                oy0 oy0Var = (oy0) obj;
                int i12 = oy0Var.a;
                oy0Var.F = null;
                my0 my0Var = oy0Var.c;
                if (my0Var != null && my0Var.getEditField() != null && oy0Var.c.getFieldText() != null) {
                    int selectionStart = oy0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = oy0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        oy0Var.s = false;
                        ai.f0 f0Var = oy0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = oy0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            x5[] x5VarArr = z10 ? (x5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, x5.class) : null;
                            if ((x5VarArr == null || x5VarArr.length == 0) && selectionEnd < 52) {
                                oy0Var.s = true;
                                oy0Var.c();
                                oy0Var.T = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = oy0Var.H;
                                    if (str == null || oy0Var.G != 1 || !str.equals(substring) || oy0Var.x || (arrayList = oy0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = oy0Var.I + 1;
                                        oy0Var.I = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (oy0Var.J == null || Math.abs(currentTimeMillis - oy0Var.L) > 360) {
                                            oy0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            oy0Var.L = currentTimeMillis;
                                            currentKeyboardLanguage = oy0Var.J;
                                        }
                                        String[] strArr = oy0Var.J;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        oy0Var.J = currentKeyboardLanguage;
                                        Runnable runnable = oy0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            oy0Var.K = null;
                                        }
                                        oy0Var.K = new ai.c9(oy0Var, currentKeyboardLanguage, substring, i13, 27);
                                        ArrayList arrayList5 = oy0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(oy0Var.K, 600L);
                                        } else {
                                            oy0Var.K.run();
                                        }
                                    } else {
                                        oy0Var.v = false;
                                        oy0Var.c();
                                        oy0Var.d.setVisibility(0);
                                        oy0Var.U = AndroidUtilities.dp(10.0f);
                                        oy0Var.d.invalidate();
                                    }
                                }
                                ai.f0 f0Var2 = oy0Var.d;
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
                                    oy0Var.s = true;
                                    oy0Var.c();
                                    oy0Var.T = emojiSpan;
                                    oy0Var.W = null;
                                    oy0Var.V = null;
                                    if (substring2 != null) {
                                        String str2 = oy0Var.H;
                                        if (str2 == null || oy0Var.G != 2 || !str2.equals(substring2) || oy0Var.x || (arrayList2 = oy0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = oy0Var.I + 1;
                                            oy0Var.I = i14;
                                            Runnable runnable2 = oy0Var.K;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            oy0Var.K = new wm(oy0Var, substring2, i14, 21);
                                            ArrayList arrayList6 = oy0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(oy0Var.K, 600L);
                                            } else {
                                                oy0Var.K.run();
                                            }
                                        } else {
                                            oy0Var.v = false;
                                            oy0Var.c();
                                            ai.f0 f0Var3 = oy0Var.d;
                                            if (f0Var3 != null) {
                                                f0Var3.setVisibility(0);
                                                oy0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    ai.f0 f0Var4 = oy0Var.d;
                                    if (f0Var4 != null) {
                                        f0Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = oy0Var.K;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            oy0Var.K = null;
                        }
                        oy0Var.s = false;
                        ai.f0 f0Var5 = oy0Var.d;
                        if (f0Var5 != null) {
                            f0Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    oy0Var.s = false;
                    oy0Var.v = true;
                    ai.f0 f0Var6 = oy0Var.d;
                    if (f0Var6 != null) {
                        f0Var6.invalidate();
                        break;
                    }
                }
                break;
            case 12:
                uy0 uy0Var = (uy0) obj;
                uy0Var.G = null;
                uy0Var.b();
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
                ((o01) obj).a();
                break;
            case 15:
                ArrayList arrayList7 = ((v01) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                break;
            case 16:
                v11 v11Var = (v11) obj;
                v11Var.J = null;
                v11Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(qr.f).start();
                break;
            case 17:
                z11 z11Var = (z11) obj;
                ViewPropertyAnimator duration = z11Var.animate().alpha(0.0f).setListener(new jd0(z11Var, 22)).setDuration(300L);
                z11Var.b = duration;
                duration.start();
                break;
            case 18:
                b21 b21Var = (b21) obj;
                Utilities.Callback callback = b21Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(b21Var.a.s));
                    break;
                }
                break;
            case 19:
                y21 y21Var = ((p21) obj).b;
                if (y21Var.k()) {
                    y21Var.l();
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
                ((g41) obj).c.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.al) obj).c.presentFragment(new org.telegram.ui.g41());
                break;
            case 25:
                ((q41) obj).requestLayout();
                break;
            case 26:
                ((h51) obj).f();
                break;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.e0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((i61) obj).invalidateSelf();
                break;
            default:
                vz vzVar = ((v61) obj).b;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    break;
                }
                break;
        }
    }
}
