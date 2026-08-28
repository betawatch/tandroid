package org.telegram.messenger;

import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ b3(FileLoader.1 r22, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
        this.e = r22;
        this.c = z10;
        this.b = str;
        this.d = z11;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.s = fileUploadOperation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((FileLoader.1) this.e).lambda$didFinishUploadingFile$0(this.c, this.b, this.d, (TLRPC.InputFile) this.f, (TLRPC.InputEncryptedFile) this.h, (byte[]) this.n, (byte[]) this.r, (FileUploadOperation) this.s);
                break;
            default:
                ((MessagesController) this.e).lambda$openApp$498((org.telegram.ui.ActionBar.o2) this.f, (ve.d) this.h, (boolean[]) this.n, (TLRPC.User) this.r, this.b, this.c, this.d, (TL_bots.BotInfo[]) this.s);
                break;
        }
    }

    public /* synthetic */ b3(MessagesController messagesController, org.telegram.ui.ActionBar.o2 o2Var, ve.d dVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = messagesController;
        this.f = o2Var;
        this.h = dVar;
        this.n = zArr;
        this.r = user;
        this.b = str;
        this.c = z10;
        this.d = z11;
        this.s = botInfoArr;
    }
}
