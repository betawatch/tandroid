package org.telegram.messenger;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class o6 implements Runnable {
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

    public /* synthetic */ o6(MediaController mediaController, int i10, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        this.b = mediaController;
        this.c = i10;
        this.d = i11;
        this.e = j3;
        this.f = j10;
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

    public /* synthetic */ o6(MediaController mediaController, int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.b = mediaController;
        this.c = i10;
        this.v = draftVoice;
        this.d = i11;
        this.e = j3;
        this.f = j10;
        this.h = messageSuggestionParams;
        this.n = messageObject;
        this.r = messageObject2;
        this.s = storyItem;
    }
}
