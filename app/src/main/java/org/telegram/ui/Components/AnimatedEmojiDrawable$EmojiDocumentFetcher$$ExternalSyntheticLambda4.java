package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_messages_getCustomEmojiDocuments;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
/* loaded from: classes3.dex */
public final /* synthetic */ class AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ AnimatedEmojiDrawable.EmojiDocumentFetcher f$0;
    public final /* synthetic */ TLObject f$1;
    public final /* synthetic */ TLRPC$TL_messages_getCustomEmojiDocuments f$2;

    public /* synthetic */ AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda4(AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher, TLObject tLObject, TLRPC$TL_messages_getCustomEmojiDocuments tLRPC$TL_messages_getCustomEmojiDocuments) {
        this.f$0 = emojiDocumentFetcher;
        this.f$1 = tLObject;
        this.f$2 = tLRPC$TL_messages_getCustomEmojiDocuments;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$loadFromServer$3(this.f$1, this.f$2);
    }
}
