package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ep implements w60 {
    public final /* synthetic */ np a;

    public ep(np npVar) {
        this.a = npVar;
    }

    @Override // org.telegram.ui.w60
    public final void a(x60 x60Var, long j10) {
        np npVar = this.a;
        npVar.Z(npVar.getMessagesController().getChat(Long.valueOf(j10)), x60Var);
    }
}
