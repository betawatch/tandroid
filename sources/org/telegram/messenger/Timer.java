package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class Timer {
    final String name;
    int pad = 0;
    public ArrayList<Task> tasks = new ArrayList<>();
    final long startTime = System.currentTimeMillis();

    /* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
    public class Log extends Task {
        public Log(String str) {
            super(str);
        }

        @Override // org.telegram.messenger.Timer.Task
        public String toString() {
            return this.task;
        }
    }

    /* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
    public class Task {
        int pad;
        final String task;
        long endTime = -1;
        final long startTime = System.currentTimeMillis();

        public Task(String str) {
            this.task = str;
            Timer.this.pad++;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void done() {
            if (this.endTime < 0) {
                Timer timer = Timer.this;
                int i10 = timer.pad;
                timer.pad = i10 - 1;
                this.pad = i10;
            }
            this.endTime = System.currentTimeMillis();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.task);
            sb.append(": ");
            sb.append(this.endTime < 0 ? "not done" : android.support.v4.media.a.q(new StringBuilder(), this.endTime - this.startTime, "ms"));
            return sb.toString();
        }
    }

    public Timer(String str) {
        this.name = str;
    }

    public static Timer create(String str) {
        if (BuildVars.LOGS_ENABLED) {
            return new Timer(str);
        }
        return null;
    }

    public static void done(Task task) {
        if (task != null) {
            task.done();
        }
    }

    public static void finish(Timer timer) {
        if (timer != null) {
            timer.finish();
        }
    }

    public static void log(Timer timer, String str) {
        if (timer != null) {
            timer.log(str);
        }
    }

    public static Task start(Timer timer, String str) {
        if (timer != null) {
            return timer.start(str);
        }
        return null;
    }

    private void finish() {
        long currentTimeMillis = System.currentTimeMillis() - this.startTime;
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(" total=");
        sb.append(currentTimeMillis);
        sb.append("ms\n");
        for (int i10 = 0; i10 < this.tasks.size(); i10++) {
            if (this.tasks.get(i10) != null) {
                sb.append("#");
                sb.append(i10);
                int i11 = this.tasks.get(i10).pad;
                for (int i12 = 0; i12 < i11; i12++) {
                    sb.append(" ");
                }
                sb.append(" ");
                sb.append(this.tasks.get(i10));
                sb.append("\n");
            }
        }
        FileLog.d(sb.toString());
    }

    private void log(String str) {
        this.tasks.add(new Log(str));
    }

    private Task start(String str) {
        Task task = new Task(str);
        this.tasks.add(task);
        return task;
    }
}
