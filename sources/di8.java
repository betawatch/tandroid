// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class di8 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ji8 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ e e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ di8(ji8 ji8Var, boolean z, TLRPC.PollAnswer pollAnswer, e eVar, ArrayList arrayList) {
        this.b = ji8Var;
        this.c = z;
        this.d = pollAnswer;
        this.e = eVar;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.f;
        e eVar = this.e;
        TLRPC.PollAnswer pollAnswer = this.d;
        boolean z = this.c;
        ji8 ji8Var = this.b;
        switch (b) {
            case 0:
                if (z) {
                    arrayList.remove(pollAnswer);
                    eVar.getSendMessagesHelper().v0(ji8Var.I, arrayList, null);
                } else {
                    eVar.getSendMessagesHelper().v0(ji8Var.I, null, null);
                }
                ji8Var.b(true);
                break;
            default:
                if (z) {
                    arrayList.add(pollAnswer);
                    eVar.getSendMessagesHelper().v0(ji8Var.I, arrayList, null);
                } else {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    eVar.getSendMessagesHelper().v0(ji8Var.I, arrayList2, null);
                }
                ji8Var.b(true);
                break;
        }
    }

    public /* synthetic */ di8(ji8 ji8Var, boolean z, e eVar, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = ji8Var;
        this.c = z;
        this.e = eVar;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
