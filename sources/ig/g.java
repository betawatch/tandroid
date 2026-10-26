package ig;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.ActionBar.c7;
import org.telegram.ui.Components.ar;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements c7, e2.o {
    public final /* synthetic */ int a;

    @Override // org.telegram.ui.ActionBar.c7
    public int e(View view) {
        Drawable background = view.getBackground();
        if (!(background instanceof ar)) {
            return 0;
        }
        Drawable drawable = ((ar) background).a;
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        return 0;
    }

    @Override // e2.o
    public void invoke(Object obj) {
        j2.b bVar = (j2.b) obj;
        switch (this.a) {
            case 1:
                bVar.getClass();
                break;
            case 2:
                bVar.getClass();
                break;
            case 3:
                bVar.getClass();
                break;
            case 4:
                bVar.getClass();
                break;
            case 5:
                bVar.getClass();
                break;
            case 6:
                bVar.getClass();
                break;
            case 7:
                bVar.getClass();
                break;
            case 8:
                bVar.getClass();
                break;
            case 9:
                bVar.getClass();
                break;
            case 10:
                bVar.getClass();
                break;
            case 11:
                bVar.getClass();
                break;
            case 12:
                bVar.getClass();
                break;
            case 13:
                bVar.getClass();
                break;
            case 14:
                bVar.getClass();
                break;
            case 15:
                bVar.getClass();
                break;
            case 16:
                bVar.getClass();
                break;
            case 17:
                bVar.getClass();
                break;
            case 18:
                bVar.getClass();
                break;
            case 19:
                bVar.getClass();
                break;
            case 20:
                bVar.getClass();
                break;
            case 21:
                bVar.getClass();
                break;
            case 22:
                bVar.getClass();
                break;
            case 23:
                bVar.getClass();
                break;
            case 24:
                bVar.getClass();
                break;
            case 25:
                bVar.getClass();
                break;
            case 26:
                bVar.getClass();
                break;
            case 27:
                bVar.getClass();
                break;
            case 28:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    public /* synthetic */ g(j2.a aVar) {
        this.a = 22;
    }

    public /* synthetic */ g(j2.a aVar, int i10, int i11, char c10) {
        this.a = i11;
    }

    public /* synthetic */ g(j2.a aVar, String str, long j10, long j11, int i10) {
        this.a = i10;
    }
}
