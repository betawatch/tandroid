package ai;

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ii.h c;

    public /* synthetic */ i(boolean[] zArr, ii.h hVar, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                ii.h hVar = this.c;
                t[] tVarArr = DictationAsr.a;
                if (!zArr[0]) {
                    hVar.a(null, null, true);
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = this.b;
                ii.h hVar2 = this.c;
                t[] tVarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    hVar2.a(null, null, true);
                    break;
                }
                break;
            default:
                boolean[] zArr3 = this.b;
                ii.h hVar3 = this.c;
                t[] tVarArr3 = DictationAsr.a;
                if (!zArr3[0]) {
                    hVar3.a(null, null, true);
                    break;
                }
                break;
        }
    }
}
