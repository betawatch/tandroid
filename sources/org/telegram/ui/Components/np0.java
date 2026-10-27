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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class np0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ np0(fi.e2 e2Var, int i10) {
        this.a = 14;
        this.b = e2Var;
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
                org.telegram.ui.Cells.s1 s1Var = ((qp0) obj).n;
                if (s1Var != null) {
                    s1Var.invalidate();
                    break;
                }
                break;
            case 1:
                rp0 rp0Var = (rp0) obj;
                rp0Var.q = false;
                rp0Var.b.run();
                break;
            case 2:
                ((nr0) ((bi.u) obj).b).d1(1);
                break;
            case 3:
                rr0 rr0Var = (rr0) obj;
                pr0[] pr0VarArr = rr0Var.a;
                if (rr0Var.b != 1) {
                    for (pr0 pr0Var : pr0VarArr) {
                        org.telegram.ui.ActionBar.b6 b6Var = pr0Var.d;
                        b6Var.setAlpha(1.0f);
                        b6Var.setScaleX(1.0f);
                        b6Var.setScaleY(1.0f);
                        pr0Var.e.setAlpha(0.0f);
                    }
                    rr0Var.E = false;
                    AndroidUtilities.runOnUIThread(rr0Var.G, 4000L);
                    break;
                } else {
                    rr0Var.E = !rr0Var.E;
                    int length = pr0VarArr.length;
                    while (i11 < length) {
                        pr0 pr0Var2 = pr0VarArr[i11];
                        org.telegram.ui.ActionBar.b6 b6Var2 = pr0Var2.d;
                        org.telegram.ui.ActionBar.b6 b6Var3 = pr0Var2.e;
                        b6Var2.setPivotX(0.0f);
                        b6Var3.setPivotX(0.0f);
                        if (rr0Var.E) {
                            b6Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            b6Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            b6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            b6Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                        i11++;
                    }
                    AndroidUtilities.runOnUIThread(rr0Var.G, 4000L);
                    break;
                }
            case 4:
                ((pr0) obj).setVisibility(8);
                break;
            case 5:
                bw0 bw0Var = ((vs0) obj).G;
                if (bw0Var.E1) {
                    bw0Var.k1(false);
                    break;
                }
                break;
            case 6:
                ((eu0) obj).a.v1(false);
                break;
            case 7:
                org.telegram.ui.ActionBar.r2 r2Var = ((ku0) obj).f.x1;
                if (r2Var != null) {
                    r2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 8:
                ((np0) obj).run();
                break;
            case 9:
                mv0 mv0Var = (mv0) obj;
                ArrayList arrayList3 = mv0Var.f;
                if (mv0Var.h) {
                    mv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    mv0Var.x.x1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 10:
                ((nv0) obj).F();
                break;
            case 11:
                ((ww0) obj).V();
                break;
            case 12:
                break;
            case 13:
                ((fx0) obj).getClass();
                break;
            case 14:
                ((cy0) obj).l0(0);
                break;
            case 15:
                xx0 xx0Var = (xx0) obj;
                if (!xx0Var.w) {
                    xx0Var.y = 0.0f;
                    break;
                }
                break;
            case 16:
                ((kz0) obj).b();
                break;
            case 17:
                uz0 uz0Var = (uz0) obj;
                int i12 = uz0Var.a;
                uz0Var.H = null;
                sz0 sz0Var = uz0Var.c;
                if (sz0Var != null && sz0Var.getEditField() != null && uz0Var.c.getFieldText() != null) {
                    int selectionStart = uz0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = uz0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        uz0Var.s = false;
                        bh.r rVar = uz0Var.d;
                        if (rVar != null) {
                            rVar.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = uz0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            c6[] c6VarArr = z10 ? (c6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, c6.class) : null;
                            if ((c6VarArr == null || c6VarArr.length == 0) && selectionEnd < 52) {
                                uz0Var.s = true;
                                uz0Var.c();
                                uz0Var.V = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = uz0Var.J;
                                    if (str == null || uz0Var.I != 1 || !str.equals(substring) || uz0Var.x || (arrayList = uz0Var.w) == null || arrayList.isEmpty()) {
                                        int i13 = uz0Var.K + 1;
                                        uz0Var.K = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (uz0Var.L == null || Math.abs(currentTimeMillis - uz0Var.N) > 360) {
                                            uz0Var.N = currentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            uz0Var.N = currentTimeMillis;
                                            currentKeyboardLanguage = uz0Var.L;
                                        }
                                        String[] strArr = uz0Var.L;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        uz0Var.L = currentKeyboardLanguage;
                                        Runnable runnable = uz0Var.M;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            uz0Var.M = null;
                                        }
                                        uz0Var.M = new as0(uz0Var, currentKeyboardLanguage, substring, i13, 2);
                                        ArrayList arrayList5 = uz0Var.w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(uz0Var.M, 600L);
                                        } else {
                                            uz0Var.M.run();
                                        }
                                    } else {
                                        uz0Var.v = false;
                                        uz0Var.c();
                                        uz0Var.d.setVisibility(0);
                                        uz0Var.W = AndroidUtilities.dp(10.0f);
                                        uz0Var.d.invalidate();
                                    }
                                }
                                bh.r rVar2 = uz0Var.d;
                                if (rVar2 != null) {
                                    rVar2.invalidate();
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
                                    uz0Var.s = true;
                                    uz0Var.c();
                                    uz0Var.V = emojiSpan;
                                    uz0Var.b0 = null;
                                    uz0Var.a0 = null;
                                    if (substring2 != null) {
                                        String str2 = uz0Var.J;
                                        if (str2 == null || uz0Var.I != 2 || !str2.equals(substring2) || uz0Var.x || (arrayList2 = uz0Var.w) == null || arrayList2.isEmpty()) {
                                            int i14 = uz0Var.K + 1;
                                            uz0Var.K = i14;
                                            Runnable runnable2 = uz0Var.M;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            uz0Var.M = new org.telegram.ui.g4(uz0Var, substring2, i14, 25);
                                            ArrayList arrayList6 = uz0Var.w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(uz0Var.M, 600L);
                                            } else {
                                                uz0Var.M.run();
                                            }
                                        } else {
                                            uz0Var.v = false;
                                            uz0Var.c();
                                            bh.r rVar3 = uz0Var.d;
                                            if (rVar3 != null) {
                                                rVar3.setVisibility(0);
                                                uz0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    bh.r rVar4 = uz0Var.d;
                                    if (rVar4 != null) {
                                        rVar4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = uz0Var.M;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            uz0Var.M = null;
                        }
                        uz0Var.s = false;
                        bh.r rVar5 = uz0Var.d;
                        if (rVar5 != null) {
                            rVar5.invalidate();
                            break;
                        }
                    }
                } else {
                    uz0Var.s = false;
                    uz0Var.v = true;
                    bh.r rVar6 = uz0Var.d;
                    if (rVar6 != null) {
                        rVar6.invalidate();
                        break;
                    }
                }
                break;
            case 18:
                a01 a01Var = (a01) obj;
                a01Var.K = null;
                a01Var.b();
                break;
            case 19:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 20:
                ((y11) obj).a();
                break;
            case 21:
                ArrayList arrayList7 = ((e21) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) arrayList7.get(i15)).L3(false, false);
                        ((org.telegram.ui.Cells.s1) arrayList7.get(i15)).N3(false, false, false);
                    }
                }
                break;
            case 22:
                e31 e31Var = (e31) obj;
                e31Var.J = null;
                e31Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(ds.f).start();
                break;
            case 23:
                j31 j31Var = (j31) obj;
                ViewPropertyAnimator duration = j31Var.animate().alpha(0.0f).setListener(new i31(j31Var, i11)).setDuration(300L);
                j31Var.b = duration;
                duration.start();
                break;
            case 24:
                l31 l31Var = (l31) obj;
                Utilities.Callback callback = l31Var.b;
                if (callback != null) {
                    callback.run(Long.valueOf(l31Var.a.t));
                    break;
                }
                break;
            case 25:
                f41 f41Var = ((w31) obj).b;
                if (f41Var.l()) {
                    f41Var.m();
                    break;
                }
                break;
            case 26:
                MessageObject messageObject = (MessageObject) obj;
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                break;
            case 27:
                ((Utilities.Callback2) obj).run(null, Boolean.FALSE);
                break;
            case 28:
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                break;
            default:
                ((r51) obj).c.setVisibility(8);
                break;
        }
    }

    public /* synthetic */ np0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
