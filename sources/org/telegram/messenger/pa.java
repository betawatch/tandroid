package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;

    public /* synthetic */ pa(MessagesController messagesController, long j3, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setChannelSlowMode$93(this.c);
                break;
            case 1:
                this.b.lambda$setChatReactions$470(this.c);
                break;
            case 2:
                this.b.lambda$getChannelDifference$343(this.c);
                break;
            case 3:
                this.b.lambda$deleteDialog$140(this.c);
                break;
            case 4:
                this.b.lambda$setDefaultBannedRole$97(this.c);
                break;
            case 5:
                this.b.lambda$processUpdateArray$383(this.c);
                break;
            case 6:
                this.b.lambda$getSavedReactionTags$488(this.c);
                break;
            case 7:
                this.b.lambda$getChannelDifference$334(this.c);
                break;
            case 8:
                this.b.lambda$getChannelDifference$335(this.c);
                break;
            case 9:
                this.b.lambda$getChannelDifference$336(this.c);
                break;
            case 10:
                this.b.lambda$getChannelDifference$337(this.c);
                break;
            case 11:
                this.b.lambda$removeDialog$134(this.c);
                break;
            case 12:
                this.b.lambda$deleteParticipantFromChat$312(this.c);
                break;
            case 13:
                this.b.lambda$setParticipantBannedRole$90(this.c);
                break;
            case 14:
                this.b.lambda$deleteDialog$139(this.c);
                break;
            case 15:
                this.b.lambda$setBoostsToUnblockRestrictions$95(this.c);
                break;
            case 16:
                this.b.lambda$deleteParticipantFromChat$315(this.c);
                break;
            case 17:
                this.b.lambda$addUserToChat$298(this.c);
                break;
            case 18:
                this.b.lambda$addUserToChat$309(this.c);
                break;
            case 19:
                this.b.lambda$addUserToChat$307(this.c);
                break;
            case 20:
                this.b.lambda$getChannelDifference$344(this.c);
                break;
            default:
                this.b.lambda$getChannelDifference$345(this.c);
                break;
        }
    }
}
