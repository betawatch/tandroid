package ig;

import ag.i1;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import hh.j2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.t5;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class s0 {
    public static void a(TLRPC.TL_availableReaction tL_availableReaction, LinkedHashMap linkedHashMap, ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, q qVar, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j10 = document.id;
        t5 e9 = e(document, Long.valueOf(j10), fontMetricsInt);
        linkedHashMap.put(Long.valueOf(j10), e9);
        arrayList.add(Long.valueOf(j10));
        SpannableString spannableString = new SpannableString(tL_availableReaction.reaction);
        spannableString.setSpan(e9, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (qVar != null) {
            qVar.x(Long.valueOf(j10), false);
        }
    }

    public static void b(TLRPC.Reaction reaction, TLRPC.Reaction reaction2, TL_stories.StoryViews storyViews) {
        if (storyViews == null) {
            return;
        }
        int i10 = 0;
        boolean z10 = false;
        while (i10 < storyViews.reactions.size()) {
            TLRPC.ReactionCount reactionCount = storyViews.reactions.get(i10);
            if (reaction != null && d(reactionCount.reaction, reaction)) {
                int i11 = reactionCount.count - 1;
                reactionCount.count = i11;
                if (i11 <= 0) {
                    storyViews.reactions.remove(i10);
                    i10--;
                    i10++;
                }
            }
            if (reaction2 != null && d(reactionCount.reaction, reaction2)) {
                reactionCount.count++;
                z10 = true;
            }
            i10++;
        }
        if (z10) {
            return;
        }
        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
        tL_reactionCount.count = 1;
        tL_reactionCount.reaction = reaction2;
        storyViews.reactions.add(tL_reactionCount);
    }

    public static boolean c(TLRPC.Reaction reaction, q0 q0Var) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && q0Var.g == 0 && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, q0Var.f)) {
            return true;
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
            return false;
        }
        long j10 = q0Var.g;
        return j10 != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j10;
    }

    public static boolean d(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji) && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
            return true;
        }
        return (reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
    }

    public static t5 e(TLRPC.Document document, Long l10, Paint.FontMetricsInt fontMetricsInt) {
        t5 t5Var;
        if (document != null) {
            t5Var = new t5(document.id, 1.0f, fontMetricsInt);
            t5Var.document = document;
        } else {
            t5Var = new t5(l10.longValue(), 1.0f, fontMetricsInt);
        }
        t5Var.cacheType = k5.g();
        return t5Var;
    }

    public static void f(long j10, int i10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        n2 R = LaunchActivity.R();
        if (R == null || tL_premium_boostsStatus == null) {
            return;
        }
        i1 i1Var = new i1(21, UserConfig.selectedAccount, R.getContext(), R, R.getResourceProvider());
        i1Var.N0 = i10;
        i1Var.F1(tL_premium_boostsStatus, true);
        i1Var.H1(j10);
        i1Var.M0 = new j2(R, j10);
        i1Var.show();
    }
}
