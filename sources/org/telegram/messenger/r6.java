package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ MessageSuggestionParams h;
    public final /* synthetic */ MessageObject n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ TL_stories.StoryItem s;
    public final /* synthetic */ Object v;

    public /* synthetic */ r6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.b = mediaController;
        this.c = i10;
        this.d = i11;
        this.e = j10;
        this.f = j11;
        this.h = messageSuggestionParams;
        this.n = messageObject;
        this.r = messageObject2;
        this.s = storyItem;
        this.v = sendMessageChatArguments;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$prepareResumedRecording$27(this.c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f, this.h, this.n, this.r, this.s);
                break;
            default:
                this.b.lambda$startRecording$40(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, (SendMessageChatArguments) this.v);
                break;
        }
    }

    public /* synthetic */ r6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.b = mediaController;
        this.c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j10;
        this.f = j11;
        this.h = messageSuggestionParams;
        this.n = messageObject;
        this.r = messageObject2;
        this.s = storyItem;
    }
}
