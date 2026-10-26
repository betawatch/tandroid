package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class mb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;

    public /* synthetic */ mb(MessagesController messagesController, long j10, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getChannelDifference$345(this.c);
                break;
            case 1:
                this.b.lambda$deleteParticipantFromChat$316(this.c);
                break;
            case 2:
                this.b.lambda$getChannelDifference$346(this.c);
                break;
            case 3:
                this.b.lambda$setChatReactions$475(this.c);
                break;
            case 4:
                this.b.lambda$setBoostsToUnblockRestrictions$94(this.c);
                break;
            case 5:
                this.b.lambda$deleteDialog$139(this.c);
                break;
            case 6:
                this.b.lambda$processUpdateArray$388(this.c);
                break;
            case 7:
                this.b.lambda$getSavedReactionTags$493(this.c);
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
                this.b.lambda$getChannelDifference$338(this.c);
                break;
            case 12:
                this.b.lambda$setChannelSlowMode$92(this.c);
                break;
            case 13:
                this.b.lambda$deleteDialog$138(this.c);
                break;
            case 14:
                this.b.lambda$removeDialog$133(this.c);
                break;
            case 15:
                this.b.lambda$setParticipantBannedRole$89(this.c);
                break;
            case 16:
                this.b.lambda$addUserToChat$297(this.c);
                break;
            case 17:
                this.b.lambda$addUserToChat$307(this.c);
                break;
            case 18:
                this.b.lambda$addUserToChat$310(this.c);
                break;
            case 19:
                this.b.lambda$addUserToChat$306(this.c);
                break;
            case 20:
                this.b.lambda$getChannelDifference$344(this.c);
                break;
            case 21:
                this.b.lambda$deleteParticipantFromChat$313(this.c);
                break;
            default:
                this.b.lambda$setDefaultBannedRole$96(this.c);
                break;
        }
    }
}
