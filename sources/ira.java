// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ira implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;
    public final /* synthetic */ int c;

    public /* synthetic */ ira(wua wuaVar, int i, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        int i = this.c;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.P2 = i;
                fta ftaVar = wuaVar.U1;
                ftaVar.F(ftaVar.getCurrentPosition() + (i > wuaVar.x1() ? 1 : -1));
                break;
            case 1:
                wuaVar.P2 = i;
                fta ftaVar2 = wuaVar.U1;
                ftaVar2.F(ftaVar2.getCurrentPosition() + (i > wuaVar.x1() ? 1 : -1));
                break;
            case 2:
                wuaVar.P2 = i;
                fta ftaVar3 = wuaVar.U1;
                ftaVar3.F(ftaVar3.getCurrentPosition() + (i > wuaVar.x1() ? 1 : -1));
                break;
            default:
                wuaVar.P2 = i;
                fta ftaVar4 = wuaVar.U1;
                ftaVar4.F(ftaVar4.getCurrentPosition() + (i > wuaVar.x1() ? 1 : -1));
                break;
        }
    }
}
