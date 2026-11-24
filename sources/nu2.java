// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nu2 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nu2(tu2 tu2Var, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i) {
        this.c = tu2Var;
        this.d = fileLocation;
        this.f = inputFile;
        this.h = tLObject;
        this.e = fileLocation2;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((tu2) obj5).g0((TLRPC.FileLocation) obj4, (TLRPC.InputFile) obj2, (TLObject) obj, (TLRPC.FileLocation) obj3, this.b);
                break;
            default:
                hs6 hs6Var = (hs6) obj5;
                boolean[] zArr = (boolean[]) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                Context context = (Context) obj2;
                d dVar = (d) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    for (int i = 0; i < arrayList.size(); i++) {
                        hs6Var.j2(context, 0, dVar, null, true, (TLObject) arrayList.get(i), ((TLRPC.TL_messages_stickerSet) arrayList.get(i)).set, null, this.b, false);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nu2(hs6 hs6Var, boolean[] zArr, ArrayList arrayList, Context context, d dVar, int i) {
        this.c = hs6Var;
        this.d = zArr;
        this.e = arrayList;
        this.f = context;
        this.h = dVar;
        this.b = i;
    }
}
