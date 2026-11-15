package ab;

import a8.r7;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import hi.b7;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Continuation, b7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ t(r7 r7Var, String str) {
        this.a = 1;
        this.b = str;
    }

    @Override // hi.b7
    public Bitmap d(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b, options);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.a) {
            case 0:
                if (!task.isSuccessful()) {
                    throw new ExecutionException(task.getException());
                }
                String str = (String) task.getResult();
                if (!TextUtils.isEmpty(str)) {
                    String str2 = this.b;
                    if (str.endsWith(str2)) {
                        return str2;
                    }
                }
                throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
            default:
                return !task.isSuccessful() ? Tasks.forException(r7.s(task)) : Tasks.forResult(new Pair((String) task.getResult(), this.b));
        }
    }

    public /* synthetic */ t(String str, int i7) {
        this.a = i7;
        this.b = str;
    }
}
