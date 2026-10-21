package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class m91 {
    public TL_stats.PostInteractionCounters a;
    public MessageObject b;

    public final int a() {
        TL_stats.PostInteractionCounters postInteractionCounters = this.a;
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
            return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).forwards;
        }
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
            return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).forwards;
        }
        return 0;
    }

    public final int b() {
        TL_stats.PostInteractionCounters postInteractionCounters = this.a;
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
            return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).msg_id;
        }
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
            return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).story_id;
        }
        return 0;
    }

    public final int c() {
        TL_stats.PostInteractionCounters postInteractionCounters = this.a;
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
            return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).reactions;
        }
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
            return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).reactions;
        }
        return 0;
    }

    public final int d() {
        TL_stats.PostInteractionCounters postInteractionCounters = this.a;
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
            return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).views;
        }
        if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
            return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).views;
        }
        return 0;
    }
}
