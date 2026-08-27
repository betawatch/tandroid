package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class j6 implements Runnable {
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

    public /* synthetic */ j6(MediaController mediaController, int i10, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
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
                this.b.lambda$prepareResumedRecording$25(this.c, (MediaDataController.DraftVoice) this.v, this.d, this.e, this.f, this.h, this.n, this.r, this.s);
                break;
            default:
                this.b.lambda$startRecording$37(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, (SendMessageChatArguments) this.v);
                break;
        }
    }

    public /* synthetic */ j6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j10, long j11, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
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
